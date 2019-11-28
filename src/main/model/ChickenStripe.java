package model;

public class ChickenStripe extends Snacks {
    public static final double price = 9.99;
    public static final String name = "Chicken Stripe";
    public static final String ingredient = "High-quality Chicken Tenders, Salt, Plant Oil";

    public ChickenStripe() {
        super(name, price);
    }

//    static void printChickenStripeIngr() {
//        System.out.println("Price: " + price);
//        System.out.println("Ingredient: " + ingredient);
//    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}


