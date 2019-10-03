package model;

import ui.Menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Customer implements Consumer, Loadable {
    private String name;
    private double balance = 0;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<String> names = new ArrayList<String>();


    //EFFECT: construct customer object
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    //EFFECTS: check customer name to see if the customer is new or a client
    public void checkName(Customer customer, ArrayList<Customer> customers) {
        extractName(customers);
        if (customers.size() == 0) {
            addCustomerToList(customer);
            System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
        } else {

            if (names.contains(customer.name)) {
                System.out.println("Continue to oder with user name: " + customer.getName(customer));
            } else {
                addCustomerToList(customer);
                System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
            }
        }
    }

//        if (customers.contains(customer)) {
//            System.out.println("Continue to oder with user name: " + customer.getName(customer));
//        } else {
//            addCustomerToList(customer);
//            System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
//            for (Customer c : customers) {
//                Menu.say();
//            }
//        }
//        startOrder();


    @Override
    //EFFECTS: scan the user input name, create customer object and pass it to checkName
    public void startOrder() {
        Customer customer;
        ArrayList<String> order = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Menu.print();
        String operation = scanner.nextLine();
        customer = new Customer(operation, 0);
        checkName(customer, customers);
        Snacks.makeOrder();

    }


    @Override
    //MODIFIES: this
    //EFFECTS: add moneySpent to the account balance
    public void addMoney(Customer customer, double moneySpent) {
        customer.balance = balance + moneySpent;
    }


    @Override
    //REQUIRE: customer is not new customer
    //EFFECTS: return the balance of a customer account
    public double checkBalance(Customer customer) {
        return customer.balance;
    }

    @Override
    //REQUIRE: customer is not new customer
    //EFFECTS: return the name of a customer account
    public String getName(Customer customer) {
        return customer.name;
    }

    //MODIFIES: customers
    //EFFECTS: add customer to customers
    public void addCustomerToList(Customer customer) {

        customers.add(customer);
    }

    public void extractName(ArrayList<Customer> customers) {

        for (Customer c : customers) {
            names.add(c.name);
        }
    }
}






//    public boolean contain(Customer customer, ArrayList<Customer> customers) {
//        for (Customer c : customers) {
//            if (customer.name == c.name) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }
//}
























