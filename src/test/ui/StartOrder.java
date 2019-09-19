package ui;


import java.util.ArrayList;
import java.util.Scanner;


public class StartOrder {
    public String name;
    public double amt;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private Scanner scanner;
    private String operation;

    //private ArrayList<Customer> customers1;

    public void addCustomerToList(Customer customer) {
        customers.add(customer);
    }

    public void checkName(Customer customer, ArrayList<Customer> customers){

        if (customers.contains(customer)) {
            System.out.println("Continue to oder with user name: "+customer.getName(customer));
        }
        else {
            addCustomerToList(customer);
            System.out.println("First time? Continue to oder with user name: "+customer.getName(customer));
            for (Customer c:customers) {
                menu.say();
            }
        }
        new StartOrder();
    }



    public StartOrder() {
        scanner = new Scanner(System.in);
        Customer customer1;

        menu.print();
    }}