package model;

public class SilverVip extends Vip {

    public SilverVip(Customer customer) {
        super(customer);
    }

    public Boolean promoteToSilver(Customer customer) {
        if (customer.getBalance() >= 1000) {
            new SilverVip(customer);
            return true;
        }
        return false;
    }
}
