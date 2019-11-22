package model;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String printPrice1() {
        return ("$17.39");
    }

//    @Override
//    public void printPrice2() {
//
//    }

    @Override
    public String printIngredient1() {
        return ("Free run chicken, organic plant oil, oat or white bread");
    }

//    @Override
//    public void printIngredient2() {
//
//    }

    @Override
    public String printPopularity1() {
        return ("*****");
    }

//    @Override
//    public void printPopularity2() {
//
//    }

    @Override
    public String printName1() {
        return ("Classical Chicken Burger");
    }

    public static String printOrder() {
        return ("Choose one burger below");
    }

    public static String printOrder1() {
        return ("You've successfully ordered classical chicken burger");
    }
}
