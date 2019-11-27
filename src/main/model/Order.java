package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order extends Subject {
    private static Map<Customer, ArrayList<Food>> order = new HashMap<>();
    private KitchenPanel kitchenPanel = new KitchenPanel();

    public Order(Observer observer) {
        addObserver(observer);
    }

    void addCustomer(Customer customer) {
        order.put(customer,new ArrayList<>());
    }

    ArrayList getOrderedFood(Customer customer) {
        return order.get(customer);
    }

    static void addOrderedFood(Customer customer, Food food) {
        ArrayList<Food> foods = order.get(customer);
        foods.add(food);
      //  notifyObserver(foodName);
    }

    // EFFECTS: calculate the total price of a customer's order by adding the price of
    //          all foods in the map of key of that customer
    public static void printOrder(Customer customer) {
        ArrayList<Food> foods = order.get(customer);
        double totalPrice = 0;
        for (Food food: foods) {
            totalPrice = totalPrice + food.getPrice();
        }
        for (Food food : foods) {
            System.out.println("You ordered: " + food.getName());
        }
        System.out.println("Your total is: " + totalPrice);
      //  kitchenPanel.update();
    }
}

//        if (foods.contains(str)) {
//        System.out.println(str + " * 2");
//        }
//        System.out.println(str);