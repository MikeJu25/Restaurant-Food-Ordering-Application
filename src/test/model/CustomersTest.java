package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CustomersTest {
    private Customers customers;
    private Customer customer;
    private Customer customer2;
    private ArrayList<Customer> customersList = new ArrayList<>();

    @BeforeEach
    public void runBefore(){
        customers = new Customers();
        customer = new Customer("Yangxi",0);
        customer2 = new Customer("Daiwei",2);
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
      //  customers.load();
        assertTrue(lines.contains("Yangxi 0.0"));
    }

    @Test
    void testGetCustomreWithName() {
       // assertEquals(Customers.getAllCustomersName(),null);
        Customers.addCustomerToList(customer);
        Customers.addCustomerToList(new Customer("Mikew",44));
        assertEquals(Customers.getCustomerWithName("Yangxi"),customer);
    }

    @Test
    void testGetAllCustomerName() {
        Customers.addCustomerToList(customer);
        Customers.addCustomerToList(new Customer("YUE",10));
        List<String> names = new ArrayList<>();
        names = Customers.getAllCustomersName();
        assertTrue(names.contains("YUE"));
        assertTrue(names.contains("Yangxi"));
    }

    @Test
    void testRemoveCertainCustomer() {
        Customers.addCustomerToList(customer);
        customers.removeCertainCustomer(customer);
        assertFalse(customers.checkIfContains("Yangxi"));
    }

    @Test
    void testSaveAndLoad() throws IOException {
//        customers.load();
//        customers.save(customer);
//        customers.load();
        assertTrue(Customers.customers.contains(customer));
        assertFalse(Customers.customers.contains(customer2));
    }
}
