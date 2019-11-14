package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoldVipTest {
    private GoldVip goldVip;
    private Customer customer1;
    private SilverVip silverVip;
    private Customer customer2;

    @BeforeEach
    void runBefore() {
        customer1 = new Customer("Mike", 12);
        customer2 = new Customer("Ki",22);
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
        assertEquals(goldVip.accumulatedBalance(),34);
    }

    @Test
    void getVipBalance() {
        assertEquals(silverVip.getVipBalance(),12);
       // assertEquals(goldVip.getVipBalance(),12);
    }

    @Test
    void testAddNewMembers() {
        goldVip.addNewMembers(silverVip);
        assertTrue(goldVip.getVips().contains(silverVip));
    }


}
