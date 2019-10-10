package ui;


import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {






    public static void main(String[] args) throws IOException {
        Customer customer = new Customer("",21);
        customer.load();
        startOrder();
    }

    public static void startOrder() throws IOException {
        Customer customer;
        ArrayList<String> order = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Menu.print();
        String operation = scanner.nextLine();
        customer = new Customer(operation, 0);
        customer.save(operation);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        checkName(customer, customers);
        makeOrderBurger();

    }

    public static void checkName(Customer customer, ArrayList<Customer> customers) {
        customer.extractName(customers);
        if (customers.size() == 0) {
            customer.addCustomerToList(customer);
            System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
        } else {

            if (customer.names.contains(customer.name)) {
                System.out.println("Continue to oder with user name: " + customer.getName(customer));
            } else {
                customer.addCustomerToList(customer);
                System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
            }
        }
    }



    public static void makeOrderBeefBurger() {
        Food beefBurger = new BeefBurger();
        String operation = "";
        System.out.println("Do you want some beef burgers?(Yes or No)");
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextLine();

        if (operation.equals("Yes")) {
            BeefBurger.printOrder();
            System.out.println("Do you want angus beef burgers?(Yes or No)");
            operation = scanner.nextLine();
            if (operation.equals("Yes")) {
                BeefBurger.printOrder1();
            }
        } else {
            makeOrderChickenBurger();
        }

    }

    public static void makeOrderBurger() {
        String operation = "";
        System.out.println("Do you want some burgers?(Yes or No)");
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextLine();

        if (operation.equals("Yes")) {
            Burger.printOrder();
            makeOrderBeefBurger();
        } else {
            Snacks.makeOrder();
        }

    }

    public static void makeOrderChickenBurger(){

    }


}