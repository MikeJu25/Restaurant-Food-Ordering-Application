package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order extends Subject {
    private Map<Customer, ArrayList<String>> order = new HashMap<>();
    private KitchenPedal kitchenPedal = new KitchenPedal();

    public void addCustomer(Customer customer) {
        order.put(customer,new ArrayList<>());
    }

    public ArrayList getOrderedFood(Customer customer) {
        return order.get(customer);
    }

    public void addOrderedFood(Customer customer, String foodName) {
        ArrayList<String> foods = order.get(customer);
        foods.add(foodName);
        notifyObserver(foodName);
    }

    public void printOrder(Customer customer) {
        ArrayList<String> foods = order.get(customer);
        for (String str: foods) {
            System.out.println(str);
        }
        kitchenPedal.update();
    }

}
