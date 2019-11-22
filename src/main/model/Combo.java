package model;

public class Combo implements Food, Drinks {
    @Override
    public String printTips() {
        return ("Grab a cup near the front desk");
    }


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
        return ("$12.99");
    }

//    @Override
//    public void printPrice2() {
//
//    }

    @Override
    public String printIngredient1() {
        return ("Chicken Stripes + Chicken Wings + Coke Zero");
    }

//    @Override
//    public void printIngredient2() {
//
//    }

    @Override
    public String printPopularity1() {
        return ("**");
    }

//    @Override
//    public void printPopularity2() {
//
//    }

    public void combo1() {
        printPrice1();
        printIngredient1();
        printPopularity1();
    }
}
