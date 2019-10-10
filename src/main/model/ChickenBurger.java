package model;

public class ChickenBurger extends Burger {
    @Override
    public void printPrice1() {
        System.out.println("$17.39");
    }

    @Override
    public void printPrice2() {

    }

    @Override
    public void printIngredient1() {
        System.out.println("Free run chicken, organic plant oil, oat or white bread");
    }

    @Override
    public void printIngredient2() {

    }

    @Override
    public void printPopularity1() {
        System.out.println("*****");
    }

    @Override
    public void printPopularity2() {

    }

    @Override
    public void printName1() {
        System.out.println("Classical Chicken Burger");
    }

    public static void printOrder() {
        System.out.println("Choose one chicken burgers from below");
    }

    public static void printOrder1() {
        System.out.println("You've successfully ordered classical chicken burger");
    }
}
