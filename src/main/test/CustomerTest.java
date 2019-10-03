package test;

import model.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;

public class CustomerTest {
    private Customer customer1;
    private Customer customer2;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    @BeforeEach
    public void runBefore() {
        customer1 = new Customer("Mike", 0);
        customer2 = new Customer("Mi", 100);
    }

    @Test
    public void testGetName() {
        assertEquals("Mike", customer1.getName(customer1));

    }


    @Test
    public void testAddMoney() {
        customer1.addMoney(customer1, 12);
        customer2.addMoney(customer2, 77);
        assertEquals(12, customer1.checkBalance(customer1));
        assertEquals(177, customer2.checkBalance(customer2));
    }

    @Test
    public void testCheckBalance() {
        assertEquals(0, customer1.checkBalance(customer1));
        assertEquals(100, customer2.checkBalance(customer2));
    }

    @Test
    public void testAddCustomerToList() {
        customers.add(customer1);
        assertTrue(customers.contains(customer1));
    }
}