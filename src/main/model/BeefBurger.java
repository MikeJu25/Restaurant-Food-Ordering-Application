package model;

import java.util.ArrayList;

public class BeefBurger extends Burger {
    private String name;
    private double price;
    public ArrayList<Customer> customers = new ArrayList<>();

    public BeefBurger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            customer.addBeefBurger(this);
        }
    }

//    public static void printAngusBeefBurgerInfo() {
//        BeefBurger bb = new BeefBurger();
//        System.out.println(bb.printPrice1());
//        System.out.println(bb.printIngredient1());
//        System.out.println(bb.printPopularity1());
//    }

    public void removeCustomer(Customer customer) {
        if (customers.contains(customer)) {
            customers.remove(customer);
            customer.removeBeefBurger(this);
        }
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
        return ("price: $23.99");
    }

//    @Override
//    public void printPrice2() {
//
//    }


    @Override
    public String printIngredient1() {
        return "Angus beef, butter, exclusive chess, oat bread cover";
    }

//    @Override
//    public void printIngredient2() {
//
//    }

    @Override
    public String printPopularity1() {
        return ("****");
    }

//    @Override
//    public void printPopularity2() {
//
//    }

//    public static void makeOrder() {
//        Food beefBurger = new BeefBurger();
//        String operation = "";
//        System.out.println("Do you want some beef burgers?(Yes or No)");
//        Scanner scanner = new Scanner(System.in);
//        operation = scanner.nextLine();
//
//        if (operation.equals("Yes")) {
//            printOrder();
//            System.out.println("Do you want angus beef burgers?(Yes or No)");
//            operation = scanner.nextLine();
//            if (operation.equals("Yes")) {
//                printOrder1();
//            }
//        } else {
//            ChickenBurger.makeOrder();
//        }
//
//    }

    public String printName1() {
        return "Angus Beef Burger";
    }

//    public static String printOrder() {
//        return "Choose one beef burger from below";
//    }


    public static String printOrder1() {
        return "You've successfully ordered angus beef burgers";
    }
}
