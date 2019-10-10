package model;

public class Combo implements Food, Drinks {
    @Override
    public void printTips() {
        System.out.println("Grab a cup at the front desk");
    }

    @Override
    public void printPrice1() {
        System.out.println("$12.99");
    }

//    @Override
//    public void printPrice2() {
//
//    }

    @Override
    public void printIngredient1() {
        System.out.println("Chicken Stripes + Chicken Wings + Coke Zero");
    }

//    @Override
//    public void printIngredient2() {
//
//    }

    @Override
    public void printPopularity1() {
        System.out.println("**");
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
