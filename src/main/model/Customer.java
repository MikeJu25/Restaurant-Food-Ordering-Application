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

import static ui.Main.makeOrderBurger;

public class Customer implements Consumer, Loadable, Savable {
    public String name;
    private double balance = 0;
    public ArrayList<Customer> customers = new ArrayList<Customer>();
    public ArrayList<String> names = new ArrayList<String>();


    //EFFECT: construct customer object
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    //EFFECTS: check customer name to see if the customer is new or a client
//    public void checkName(Customer customer, ArrayList<Customer> customers) {
//        extractName(customers);
//        if (customers.size() == 0) {
//            addCustomerToList(customer);
//            System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
//        } else {
//
//            if (names.contains(customer.name)) {
//                System.out.println("Continue to oder with user name: " + customer.getName(customer));
//            } else {
//                addCustomerToList(customer);
//                System.out.println("First time? Continue to oder with user name: " + customer.getName(customer));
//            }
//        }
//    }

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
    public void startOrder() throws IOException {
//        Customer customer;
//        ArrayList<String> order = new ArrayList<String>();
//        Scanner scanner = new Scanner(System.in);
//        Menu.print();
//        String operation = scanner.nextLine();
//        customer = new Customer(operation, 0);
//        save(operation);
//        checkName(customer, customers);
//        makeOrderBurger();

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

    @Override
    public void load() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
        PrintWriter writer = new PrintWriter("outputfile", "UTF-8");
//        lines.add("Mike 8.99");
        for (String line : lines) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.print("Customer: " + partsOfLine.get(0) + "  ");
      //      System.out.println("Balance: " + partsOfLine.get(1));
            writer.println(line);
        }
        writer.close();
    }

    public static ArrayList<String> splitOnSpace(String line) throws IOException {
        String[] splits = line.split(" ");
        return new ArrayList<>(Arrays.asList(splits));

    }

    @Override
    public void save(String s) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
        PrintWriter writer = new PrintWriter("outputfile", "UTF-8");
        lines.add(s);
        for (String line : lines) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            System.out.print("Customer: " + partsOfLine.get(0) + "  ");
        //    System.out.println("Balance: " + partsOfLine.get(1));
            writer.println(line);
        }
        writer.close();
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
























