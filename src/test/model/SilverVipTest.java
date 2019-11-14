package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SilverVipTest {
    private GoldVip goldVip;
    private Customer customer1;
    private SilverVip silverVip;
    private Customer customer2;

    @BeforeEach
    void runBefore() {
        goldVip = new GoldVip(customer2);
        customer1 = new Customer("Mike", 120);
        customer2 = new Customer("Ki",1200);
        silverVip = new SilverVip(customer1);
    }

    @Test
    void testConstructor() {
        assertEquals(customer1,silverVip.customer);
    }

    @Test
    void testPromoteToSilver() {
        assertFalse(goldVip.promoteToGold(customer1));
        assertFalse(silverVip.promoteToSilver(customer1));
        assertTrue(silverVip.promoteToSilver(customer2));
    }
}
