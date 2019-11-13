package model;

public abstract class Vip {
    protected Customer customer;

    public Vip(Customer customer) {
        this.customer = customer;
    }

    public double getVipBalance() {
        return customer.getBalance();
    }
}
