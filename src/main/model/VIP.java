package model;

public abstract class VIP {
    protected Customer customer;

    public VIP(Customer customer) {
        this.customer = customer;
    }

    public double getVipBalance() {
        return customer.getBalance();
    }
}
