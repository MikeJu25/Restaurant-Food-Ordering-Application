package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static model.Customer.splitOnSpace;

public class Customers {
    private HashSet<Customer> customers;

    public Customers() {
        customers = new HashSet<>();
    }

    public void addCustomerToList(Customer customer) {
        customers.add(customer);
    }

    public int getSize() {
        return customers.size();
    }

    public boolean checkIfContains(Customer customer) {
        return customers.contains(customer);
    }

    public void load() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
        PrintWriter writer = new PrintWriter("inputfile", "UTF-8");
        for (String line : lines) {
            ArrayList<String> partsOfLine = splitOnSpace(line);
            addCustomerToList(new Customer(partsOfLine.get(0),0));
        }
    }
}
