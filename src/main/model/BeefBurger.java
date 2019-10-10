package model;

import java.util.Scanner;

public class BeefBurger extends Burger {

    public void angusBeefBurger() {
        printName1();
        printPrice1();
        printIngredient1();
        printPopularity1();
    }


    @Override
    public void printPrice1() {
        System.out.println("$23.99");
    }

    @Override
    public void printPrice2() {

    }


    @Override
    public void printIngredient1() {
        System.out.println("Angus beef, butter, exclusive chess, oat bread cover");
    }

    @Override
    public void printIngredient2() {

    }

    @Override
    public void printPopularity1() {
        System.out.println("****");
    }

    @Override
    public void printPopularity2() {

    }

    public static void makeOrder() {
        Food beefBurger = new BeefBurger();
        String operation = "";
        System.out.println("Do you want some beef burgers?(Yes or No)");
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextLine();

        if (operation.equals("Yes")) {
            printOrder();
            System.out.println("Do you want angus beef burgers?(Yes or No)");
            operation = scanner.nextLine();
            if (operation.equals("Yes")) {
                printOrder1();
            }
        } else {
            ChickenBurger.makeOrder();
        }

    }

    public void printName1() {
        System.out.println("Angus Beef Burger");
    }

    public static void printOrder() {
        System.out.println("Choose one beef burger from below");
    }

    public static void printOrder1() {
        System.out.println("You've successfully ordered angus beef burgers");
    }
}
