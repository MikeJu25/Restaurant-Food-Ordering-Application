package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CustomersTest {
    private Customers customers;
    private Customer customer;

    @BeforeEach
    public void runBefore(){
        customers = new Customers();
        customer = new Customer("Mike",0);
    }

    @Test
    void testAddCustomerToList(){
        customers.addCustomerToList(customer);
        assertTrue(customers.checkIfContains(customer));
    }

    @Test
    void testGetSize(){
        assertEquals(customers.getSize(),0);
        customers.addCustomerToList(customer);
        assertEquals(customers.getSize(),1);
    }
}
