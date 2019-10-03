package model;

import java.util.ArrayList;

public interface Consumer {
    String name = null;
    int balance = 0;



    //MODIFIES: this
    //EFFECTS: begin ordering
    void startOrder();

    //REQUIRES: the consumer's bill is 1 buck or more
    //MODIFIES: consumer, moneySpent
    //EFFECTS: add moneySpent to the account balance
    void addMoney(Customer customer, double moneySpent);

    //REQUIRES: the consumer is an old customer
    //MODIFIES: consumer
    //EFFECTS: get the balance of a consumer account
    double checkBalance(Customer customer);

    //REQUIRES: the consumer is a new customer
    //MODIFIES: consumer
    //EFFECTS: get the name of the consumer
    String getName(Customer customer);


}
