package model;

import exception.RepeatedName;
import exception.TooLongName;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import static ui.MakeOrder.save;

public class Name {
    public static ArrayList<String> names = new ArrayList<String>();
    private Order order = new Order(new KitchenPedal());

    public static boolean checkNameLegal(String s) throws TooLongName, RepeatedName {
        //names = new ArrayList<String>();
        if (s.length() > 10) {
            throw new TooLongName();
        } else {
            if (names.contains(s)) {
                throw new RepeatedName();
            }
        }
        return true;
    }

    public void checkName(Customer customer, Customers customers) throws IOException {
        // ArrayList<String> names = new ArrayList<String>();
        // customer.extractName(customers);
        order.addCustomer(customer);
        customers.load();
        if (customers.getSize() == 0) {
            customers.addCustomerToList(customer);
            System.out.println("First time? Continue to order with user name: " + customer.getName(customer));
            customers.save();
        } else {
            if (customers.checkIfContains(customer)) {
                System.out.println("Continue to order with user name: " + customer.getName(customer));
                customers.save();
            } else {
                customers.addCustomerToList(customer);
                System.out.println("First time? Continue to order with user name: " + customer.getName(customer));
                customers.save();
            }
        }
    }
}
