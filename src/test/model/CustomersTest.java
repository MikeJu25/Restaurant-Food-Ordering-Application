package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CustomersTest {
    private Customers customers;
    private Customer customer;

    @BeforeEach
    public void runBefore(){
        customers = new Customers();
        customer = new Customer("Yangxi",0);
    }

    @Test
    void testAddCustomerToList(){
        customers.addCustomerToList(customer);
     //   assertTrue(customers.checkIfContains(customer));
    }

    @Test
    void testGetSize(){
        assertEquals(customers.getSize(),0);
        customers.addCustomerToList(customer);
        assertEquals(customers.getSize(),1);
    }

    @Test
    void testLoadAndSave() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
        customers.addCustomerToList(customer);
       // customers.save();
        customers.load();
        assertTrue(lines.contains("Yangxi 0.0"));
    }
}
