package model;

import java.util.ArrayList;
import java.util.List;

public class GoldVip extends Vip {
   // private static List<Vip> vips;

    GoldVip(Customer customer) {
        super(customer);
        vips = new ArrayList<>();
    }

    List<Vip> getVips() {
        return vips;
    }

    void addNewMembers(Vip vip) {
        vips.add(vip);
    }

    double accumulatedBalance() {
        double result = 0;
        for (Vip vip : vips) {
            result += vip.getVipBalance();
        }
        return result + getVipBalance();
    }

    // EFFECTS: return true if the customer meets the requirement to be promoted as a gold VIP,
    //          if true make that customer as a gold VIP and add to vips list
    public static Boolean promoteToGold(Customer customer) {
        if (customer.getBalance() >= 100) {
            Vip newGoldVIP = new GoldVip(customer);
            System.out.println("You are enjoying Gold VIP price");
            vips.add(newGoldVIP);
            return true;
        }
        return false;
    }

}
