package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order extends Subject {
    private static Map<Customer, ArrayList<String>> order = new HashMap<>();
    private KitchenPanel kitchenPanel = new KitchenPanel();

    public Order(Observer observer) {
        addObserver(observer);
    }

    public void addCustomer(Customer customer) {
        order.put(customer,new ArrayList<>());
    }

    public ArrayList getOrderedFood(Customer customer) {
        return order.get(customer);
    }

    public static void addOrderedFood(Customer customer, String foodName) {
        ArrayList<String> foods = order.get(customer);
        foods.add(foodName);
      //  notifyObserver(foodName);
    }

    public static void printOrder(Customer customer) {
        ArrayList<String> foods = order.get(customer);
        for (String str : foods) {
            System.out.println("You ordered: " + str);
        }
      //  kitchenPanel.update();
    }
}

//        if (foods.contains(str)) {
//        System.out.println(str + " * 2");
//        }
//        System.out.println(str);