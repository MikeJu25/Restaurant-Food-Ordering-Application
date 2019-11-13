package model;

import java.util.ArrayList;
import java.util.List;

public class GoldVip extends Vip {
    private List<Vip> vips;

    public GoldVip(Customer customer) {
        super(customer);
        vips = new ArrayList<>();
    }

    public void addNewMembers(Vip vip) {
        vips.add(vip);
    }

    public double accumulatedBalance() {
        double result = 0;
        for (Vip vip : vips) {
            result += vip.getVipBalance();
        }
        return result;
    }
}
