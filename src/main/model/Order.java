package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Customer, ArrayList<String>> order = new HashMap<>();

    public void addCustomer(Customer customer) {
        order.put(customer,new ArrayList<String>());
    }

    public void addOrderedFood(Customer customer, String foodName) {
        ArrayList<String> food = order.get(customer);
        food.add(foodName);
    }

    public void printOrder(Customer customer) {
        ArrayList<String> food = order.get(customer);
        for (String str: food) {
            System.out.println(str);
        }
    }

}
