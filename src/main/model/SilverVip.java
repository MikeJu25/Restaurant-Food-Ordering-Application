package model;

public class SilverVip extends Vip {

    public SilverVip(Customer customer) {
        super(customer);
    }

    public static Boolean promoteToSilver(Customer customer) {
        if (customer.getBalance() >= 30) {
            new SilverVip(customer);
            System.out.println("You are enjoying Silver VIP price");
            return true;
        }
        return false;
    }
}
