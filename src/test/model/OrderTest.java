package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OrderTest {
    private Order order;
    private Customer customer;

    @BeforeEach
    void runBefore() {
        order = new Order(new KitchenPedal());
        customer = new Customer("Mike",0);
    }

    @Test
    void testAddOrderedFood(){
        order.addCustomer(customer);
        order.addOrderedFood(customer,"angus beef burger");
        order.printOrder(customer);
        assertTrue(order.getOrderedFood(customer).contains("angus beef burger"));
    }
}
