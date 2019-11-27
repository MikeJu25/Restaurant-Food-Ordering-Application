package model;

import java.beans.Customizer;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Customer implements Consumer {
    public String name;
    public double balance = 0;
    private ArrayList<BeefBurger> beefBurgers;


    @Override
    // MODIFIES: o
    // EFFECTS: overwrite equals method
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    // EFFECTS: overwrite hasCode method
    public int hashCode() {
        int result = name.hashCode();
        return result * 31;
    }

    public double getBalance() {
        return balance;
    }

    void addBeefBurger(BeefBurger beefBurger) {
        if (!beefBurgers.contains(beefBurger)) {
            beefBurgers.add(beefBurger);
            beefBurger.addCustomer(this);
        }
    }

    void removeBeefBurger(BeefBurger beefBurger) {
        if (beefBurgers.contains(beefBurger)) {
            beefBurgers.remove(beefBurger);
            beefBurger.removeCustomer(this);
        }
    }

    //EFFECT: construct customer object
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        beefBurgers = new ArrayList<>();
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
    public String getName() {
        return this.name;
    }


//    //MODIFIES: customers
//    //EFFECTS: add customer to customers
//    public void addCustomerToList(Customer customer) {
//        customers.add(customer);
//    }

//    public void extractName(Customers customers) {
//        ArrayList<String> names = new ArrayList<String>();
//        for (Customer c : customers) {
//            names.add(c.name);
//        }
//    }

//    public static ArrayList<String> splitOnSpace(String line) throws IOException {
//        String[] splits = line.split(" ");
//        return new ArrayList<>(Arrays.asList(splits));
//
//    }
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
























