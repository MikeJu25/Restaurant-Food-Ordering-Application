package model;

public class SilverVip extends Vip {

    public SilverVip(Customer customer) {
        super(customer);
    }

    public static Boolean promoteToSilver(Customer customer) {
        if (customer.getBalance() >= 1000) {
            new SilverVip(customer);
            System.out.println("Congratulation! You've been promoted to Silver VIP!");
            return true;
        }
        return false;
    }
}
