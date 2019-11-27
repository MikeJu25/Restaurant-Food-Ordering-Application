package model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Customers {
    static List<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
    }

    public static void addCustomerToList(Customer customer) {
        customers.add(customer);
    }

    public int getSize() {
        return customers.size();
    }

//    public Set<Customer> getCustomers() {
//        return customers;
//    }

    boolean checkIfContains(String customer) {
        //get a set of string of all the names in the customers array, then check if that contains string customer
        return customers.contains(customer);
    }
//
//    public double getCustomerBalance(Customer customer) {
//        if (customers.contains(customer)) {
//            return customer.getBalance();
//        }
//        return 0;
//    }

    // REQUIRES: customers list is not empty
    // EFFECTS: return names of all customers in the customer list
    public static ArrayList<String> getAllCustomersName() {
        ArrayList<String> names = new ArrayList<>();
        for (Customer customer : customers) {
            names.add(customer.getName());
        }
        return  names;
    }

    // REQUIRES: customers list is not empty
    // EFFECTS: return the customer with name customerName
    public static Customer getCustomerWithName(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return customers.get(i);
            }
        }
        return null;
    }

    // REQUIRES: file contains some lines
    // MODIFIES: this
    // EFFECTS: load the inputfile and extract all customers into a
    //          customers list based on the information stored in the file
//    public void load() throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
//        if (!(lines.size() == 0)) {
//            for (String line : lines) {
//                ArrayList<String> partsOfLine = splitOnSpace(line);
//                addCustomerToList(new Customer(partsOfLine.get(0), Double.parseDouble(partsOfLine.get(1))));
//            }
//        }
////        if (lines.size() == 0) {
////            addCustomerToList(new Customer("SomeOne", 1));
////        }
//    }

    // REQUIRES: the file is not empty
    // MODIFIES: this
    // EFFECTS: remove customer in customers list
    public void removeCertainCustomer(Customer customer) {
        if (customers.contains(customer)) {
            customers.remove(customer);
        }
    }

//    for (int i = 0; i < lines.size(); i++) {
//        ArrayList<String> partsOfLine = splitOnSpace(lines.get(i));
//        addCustomerToList(new Customer(partsOfLine.get(0),Double.parseDouble(partsOfLine.get(1))));
////            if (lines.size() == 0) {
////                break;
////            }

    // REQUIRES: customers are not empty
    // EFFECTS: extract all customers in customers list and put them into inputfile which is further
    //          stored under name and balance tags
//    public void save(Customer customer) throws IOException {
//        PrintWriter writer = new PrintWriter("inputfile", "UTF-8");
//       // File file = new File("inputfile");
//      //  writer.println("");
//        for (Customer c : customers) {
//            writer.println(c.name + " " + c.getBalance());
//          //  writer.flush();
//        }
//        writer.println(customer.name + " " + customer.getBalance());
//        writer.close();
//
//    }

//    private static ArrayList<String> splitOnSpace(String line) throws IOException {
//        String[] splits = line.split(" ");
//        return new ArrayList<>(Arrays.asList(splits));
//
//    }

}

