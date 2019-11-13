package model;

public class SilverVip extends Vip {

    public SilverVip(Customer customer) {
        super(customer);
    }

    public void promoteToSilver(Customer customer) {
        if (getVipBalance() >= 1000 && getVipBalance() >= 3000) {
            new SilverVip(customer);
        }
        if (getVipBalance() >= 3000) {
            promoteToGold(customer);
        }
    }

    public void promoteToGold(Customer customer) {
        new GoldVip(customer);
    }
}
