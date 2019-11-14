package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameTest {
    private Name name1;
    private Name name2;
    private Customer customer;
    private Customers customers;

    @BeforeEach
    void runBefore() {
        name1 = new Name();
        customer = new Customer("Mike",0);
        customers = new Customers();
    }

    @Test
    void testConstructor() {
        name2 = new Name();
    }

    @Test
    void testCheckNameEmptyCustomers() throws IOException {
        name1.checkName(customer,customers);
        assertTrue(customers.checkIfContains(customer));
    }

    @Test
    void testCheckNameNotCustomers() throws IOException {
        customers.addCustomerToList(new Customer("kk",12));
        name1.checkName(customer,customers);
        assertTrue(customers.checkIfContains(customer));
    }

    @Test
    void testCheckNameOldCustomer() throws IOException {
        customers.addCustomerToList(customer);
        name1.checkName(customer,customers);
        assertTrue(customers.checkIfContains(customer));
    }
}
