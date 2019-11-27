package model;

import java.util.List;

public abstract class Vip {
    protected Customer customer;
    protected static List<Vip> vips;

    Vip(Customer customer) {
        this.customer = customer;
    }

    double getVipBalance() {
        return customer.getBalance();
    }
}
