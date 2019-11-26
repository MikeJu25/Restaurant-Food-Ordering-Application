package model;

public class ChickenStripe extends Snacks {
    public static final double price = 9.99;
    public static final String name = "Angus Beef Burger";
    public static final String ingredient = "Angus beef, butter, exclusive chess, oat bread cover";

    public ChickenStripe() {
        super(name, price);
    }

    public static void printChickenStripeIngr() {
        System.out.println("Price: " + price);
        System.out.println("Ingredient: " + ingredient);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}


