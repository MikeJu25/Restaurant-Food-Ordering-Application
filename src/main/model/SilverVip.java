package model;

import java.util.ArrayList;

public class SilverVip extends Vip {

    public SilverVip(Customer customer) {
        super(customer);
        vips = new ArrayList<>();
    }

    // EFFECTS: return true if the customer meets the requirement to be promoted as a silver VIP,
    //          if true make that customer as a silver VIP and add to vips list
    public static Boolean promoteToSilver(Customer customer) {
        if (customer.getBalance() >= 30) {
            Vip newSilverVip = new SilverVip(customer);
            vips.add(newSilverVip);
            System.out.println("You are enjoying Silver VIP price");
            return true;
        }
        return false;
    }
}
