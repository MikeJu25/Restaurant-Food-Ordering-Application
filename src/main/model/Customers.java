package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static model.Customer.splitOnSpace;

public class Customers {
    private Set<Customer> customers;

    public Customers() {
        customers = new HashSet<>();
    }

    public void addCustomerToList(Customer customer) {
        customers.add(customer);
    }

    public int getSize() {
        return customers.size();
    }

//    public Set<Customer> getCustomers() {
//        return customers;
//    }

    public boolean checkIfContains(Customer customer) {
        return customers.contains(customer);
    }

    public void load() throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
        if (!(lines.size() == 0)) {
            for (String line : lines) {
                ArrayList<String> partsOfLine = splitOnSpace(line);

                addCustomerToList(new Customer(partsOfLine.get(0), Double.parseDouble(partsOfLine.get(1))));
            }
        }
    }

//    for (int i = 0; i < lines.size(); i++) {
//        ArrayList<String> partsOfLine = splitOnSpace(lines.get(i));
//        addCustomerToList(new Customer(partsOfLine.get(0),Double.parseDouble(partsOfLine.get(1))));
////            if (lines.size() == 0) {
////                break;
////            }

    public void save() throws IOException {
        PrintWriter writer = new PrintWriter("inputfile", "UTF-8");
        for (Customer c : customers) {
            writer.println(c.name + " " + c.getBalance());
        }
        writer.close();

    }
}

