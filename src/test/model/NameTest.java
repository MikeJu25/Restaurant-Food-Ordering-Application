package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NameTest {
    private Name name1;
    private Name name2;
    private Customer customer;
    private Customers customers;

    @BeforeEach
    void runBefore() {
        name1 = new Name();
        customer = new Customer("Mike",0);
     //   customers = new
    }

    @Test
    void testConstructor() {
        name2 = new Name();
    }

    @Test
    void testCheckName() {

    }
}
