package model;

public class Client extends Customer {


    public Client(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void startOrder() {

    }

    @Override
    public void addMoney(Customer customer, double moneySpent) {

    }

    @Override
    public double checkBalance(Customer customer) {
        return 0;
    }

    @Override
    public String getName(Customer customer) {
        return null;
    }
}