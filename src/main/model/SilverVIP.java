package model;

public class SilverVIP extends VIP {

    public SilverVIP(Customer customer) {
        super(customer);
    }

    public void promoteToSilver(Customer customer) {
        if (getVipBalance() >= 1000 && getVipBalance() >= 3000) {
            new SilverVIP(customer);
        }
        if (getVipBalance() >= 3000) {
            promoteToGold(customer);
        }
    }

    public void promoteToGold(Customer customer) {
        new GoldVIP(customer);
    }
}
