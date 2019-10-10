package model;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Burger implements Food {

    protected static ArrayList<String> order = new ArrayList<String>();

    public Burger() {
        printIngredient1();
        printPopularity1();
        printPrice1();
    }


    @Override
    public abstract void printPrice1();

//    @Override
//    public abstract void printPrice2();

    @Override
    public abstract void printIngredient1();

//    @Override
//    public abstract void printIngredient2();
//
//    @Override
//    public abstract void printPopularity1();
//
//    @Override
//    public abstract void printPopularity2();

//    public static void makeOrder() {
//        String operation = "";
//        System.out.println("Do you want some burgers?(Yes or No)");
//        Scanner scanner = new Scanner(System.in);
//        operation = scanner.nextLine();
//
//        if (operation.equals("Yes")) {
//            printOrder();
//            BeefBurger.makeOrder();
//        } else {
//            Snacks.makeOrder();
//        }
//
//    }

    public abstract void printName1();

    public static void printOrder() {
        System.out.println("Choose one burger below");
    }
}
