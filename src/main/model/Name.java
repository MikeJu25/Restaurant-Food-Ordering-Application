package model;

import exception.RepeatedName;
import exception.SelectionNotValid;
import exception.TooLongName;
import ui.MakeOrder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Name {
    private static ArrayList<String> names = new ArrayList<String>();
    private Order order = new Order(new KitchenPanel());
    private Scanner input = new Scanner(System.in);
    private Scanner input2 = new Scanner(System.in);

   // private double balance = 0;

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

    public void checkName(String customerName, Customers customers) throws IOException {
        // ArrayList<String> names = new ArrayList<String>();
        // customer.extractName(customers);
        //order.addCustomer(customer);
        customers.load();
        if (customers.getSize() == 0) {
            //make object here and add to customer list
            Customer firstCustomer = new Customer(customerName,0);
            Customers.addCustomerToList(firstCustomer);
            System.out.println("First time? Continue to order with user name: " + firstCustomer.getName());
            customers.save();
        } else {
            if (Customers.getAllCustomersName().contains(customerName)) {
                Customer customer = ifContains(customerName);
                System.out.println("Your current account balance: " + customer.getBalance());
            } else {
                System.out.println("Create an account and continue to order with user name: " + customerName);
                Customer newCustomer = new Customer(customerName,0);
                Customers.addCustomerToList(newCustomer);
                customers.save();
            }
        }
    }

    public Customer ifContains(String customerName) throws SelectionNotValid, IOException {
        System.out.println("Is this your account: " + customerName + " (y or n)");
        String command = input.next();
        command = command.toLowerCase();
        if (command.equals("y")) {
            System.out.println("Continue to order with user name: " + customerName);
           // order.addCustomer(Customers.getCustomerWithName(customerName));
            return Customers.getCustomerWithName(customerName);
        } else if (command.equals("n")) {
            System.out.println("This name has been registered. Enter another one to make a new account");
            System.out.println("Here are our suggestions: "
                    + customerName + "2  Do you want it to be your user name? (y or n)");
            String command2 = input2.next();
            if (command2.equals("y")) {
                ifY(customerName + "2");
            }
        } else {
            throw new SelectionNotValid();
        }
        return null;
    }

    public void ifY(String customerName) {
        Customer customer = new Customer(customerName,0);
        Customers.addCustomerToList(customer);
        System.out.println("Account registered with user name " + customerName);
        MakeOrder.makeOrderMainMenu();
    }

//    customer.balance = customers.getCustomerBalance(customer);;
//                customers.save();
}
