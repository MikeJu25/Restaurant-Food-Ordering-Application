package ui;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String name;
    private double moneySpent;
    private double money;


    public Customer(String name, double moneySpent) {
        this.name = name;
        this.moneySpent = 0;


    }

    public void addMoney(double money) {
        moneySpent = money + moneySpent;
    }

    public double returnCurrentMoneySpent(String name) {
        return moneySpent;
    }

    public String getName(Customer customer) {
        return name;
    }


    public double getAccountMoney(Customer customer) {
        return customer.moneySpent;
    }


}


















