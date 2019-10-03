package ui;


import model.Customer;

import java.io.IOException;

public class Main {






    public static void main(String[] args) throws IOException {
        Customer customer = new Customer("",21);
        customer.load();
        customer.startOrder();
    }


}