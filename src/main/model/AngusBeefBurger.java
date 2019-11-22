package model;

public class AngusBeefBurger extends BeefBurger {
    private static final double price = 25.99;
    private static final String name = "Angus Beef Burger";
    private static final String ingredient = "Angus beef, butter, exclusive chess, oat bread cover";

    public AngusBeefBurger() {
        super(name, price);
    }

    public static void printAngusBeefBurgerInfo() {
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