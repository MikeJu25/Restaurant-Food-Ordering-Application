package model;

import java.util.ArrayList;
import java.util.List;

public class GoldVIP extends VIP {
    private List<VIP> vips;

    public GoldVIP(Customer customer) {
        super(customer);
        vips = new ArrayList<>();
    }

    public void addNewMembers(VIP vip) {
        vips.add(vip);
    }

    public double accumulatedBalance() {
        double result = 0;
        for (VIP vip : vips) {
            result += vip.getVipBalance();
        }
        return result;
    }
}
