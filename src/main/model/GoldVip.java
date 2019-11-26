package model;

import java.util.ArrayList;
import java.util.List;

public class GoldVip extends Vip {
    private List<Vip> vips;

    public GoldVip(Customer customer) {
        super(customer);
        vips = new ArrayList<>();
    }

    public List<Vip> getVips() {
        return vips;
    }

    public void addNewMembers(Vip vip) {
        vips.add(vip);
    }

    public double accumulatedBalance() {
        double result = 0;
        for (Vip vip : vips) {
            result += vip.getVipBalance();
        }
        return result + getVipBalance();
    }

    public static Boolean promoteToGold(Customer customer) {
        if (customer.getBalance() >= 100) {
            new GoldVip(customer);
            System.out.println("You are enjoying Gold VIP price");
            return true;
        }
        return false;
    }

}
