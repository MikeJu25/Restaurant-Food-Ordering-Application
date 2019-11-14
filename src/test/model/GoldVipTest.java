package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GoldVipTest {
    private GoldVip goldVip;
    private Customer customer1;
    private SilverVip silverVip;
    private Customer customer2;

    @BeforeEach
    void runBefore() {
        customer1 = new Customer("Mike", 1200);
        customer2 = new Customer("Ki",3022);
        goldVip = new GoldVip(customer2);
        silverVip = new SilverVip(customer1);
    }

    @Test
    void testConstructor() {
        assertEquals(customer2,goldVip.customer);
    }

    @Test
    void testAccumulatedBalance() {
        goldVip.addNewMembers(silverVip);
        assertEquals(goldVip.accumulatedBalance(),4222);
    }

    @Test
    void getVipBalance() {
        assertEquals(silverVip.getVipBalance(),1200);
       // assertEquals(goldVip.getVipBalance(),12);
    }

    @Test
    void testAddNewMembers() {
        goldVip.addNewMembers(silverVip);
        assertTrue(goldVip.getVips().contains(silverVip));
    }

    @Test
    void testPromoteToGold() {
        assertFalse(goldVip.promoteToGold(customer1));
        assertTrue(goldVip.promoteToGold(customer2));
    }
}
