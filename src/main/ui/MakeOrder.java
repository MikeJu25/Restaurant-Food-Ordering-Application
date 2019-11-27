package ui;

import exception.RepeatedName;
import exception.SelectionNotValid;
import exception.TooLongName;
import model.*;

import javax.security.sasl.SaslException;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import static model.Name.checkNameLegal;

public class MakeOrder extends JPanel {
    private Order order;
    // public static ArrayList<String> names = new ArrayList<String>();
    private static Scanner input1;
    private static Scanner input2;
    private static Scanner input3;
    private Customers customers;
    public static double totalPrice = 0;
//    private Menu mainMenu;
//    private Menu burgerMenu;
//    private Menu beefBurgerMenu;
    private static Customer customer;
    private Name name;
    private KitchenPanel kitchenPanel;
    private static ArrayList<Food> foods;
//    private SilverVip silverVip;
//    private GoldVip goldVip;
    // private Map<String, Double> customer;

    MakeOrder() {
        customers = new Customers();
        //mainMenu = new MainMenu();
       // burgerMenu = new BurgerMenu();
        //beefBurgerMenu = new BeefBurgerMenu();
        name = new Name();
        kitchenPanel = new KitchenPanel();
        input1 = new Scanner(System.in);
        input2 = new Scanner(System.in);
        order = new Order(kitchenPanel);
        input3 = new Scanner(System.in);
        foods = new ArrayList<>();
//        silverVip = new SilverVip(customer);
//        goldVip = new GoldVip(customer);
    }



//    public void startOrder() throws IOException, TooLongName, RepeatedName, SelectionNotValid {
//     //   order.addObserver(kitchenPedal);
//        print();
//        String operation = input1.nextLine();
//        if (checkNameLegal(operation)) {
//            //customer = new Customer(operation, 0);
//            System.out.println("Do you want to order with member or visitor (m or v)");
//            String operation2 = input2.next();
//           // operation2.toLowerCase();
//            if (operation2.equals("m")) {
//                name.checkName(operation, customers);
//                makeOrderMainMenu();
//            }
//            if (operation2.equals("v")) {
//                Customer customer = new Customer(operation,0);
//                order.addCustomer(customer);
//                makeOrderMainMenu();
//            } else {
//                throw new SelectionNotValid();
//            }
//        }
//    }

//    public static boolean checkNameLegal(String s) throws TooLongName, RepeatedName {
//        //names = new ArrayList<String>();
//        if (s.length() > 10) {
//            throw new TooLongName();
//        } else {
//            if (names.contains(s)) {
//                throw new RepeatedName();
//            }
//        }
//        return true;
//    }

//    public static void makeOrderMainMenu() {
//        boolean keepGoing = true;
//        String command = null;
//        // init();
//        while (keepGoing) {
//            MainMenu.displayMenu();
//            command = input1.next();
//            command = command.toLowerCase();
//
//            if (command.equals("b")) {
//                makeOrderBurger();
//            } else if (command.equals("s")) {
//                makeOrderSnacks();
////            else if(command.equals("d"))
////                ();
//            } else if (command.equals("q")) {
//                SilverVip.promoteToSilver(customer);
//                keepGoing = false;
//            } else {
//                System.out.println("Selection not valid...");
//            }
//        }
//        //  System.out.println("\nThank you for ordering with automatic machine, goodbye!");
//    }


//    private static void displayMenu() {
//        System.out.println("\nSelect from:");
//        System.out.println("\tb -> Burger");
//        System.out.println("\ts -> Snacks");
//        // System.out.println("\td -> Drinks");
//        // System.out.println("\tc -> Combo");
//        System.out.println("\tq -> quit");
//    }

//    public void checkName(Customer customer, Customers customers) throws IOException {
//       // ArrayList<String> names = new ArrayList<String>();
//       // customer.extractName(customers);
//        order.addCustomer(customer);
//       // customers.load();
//        if (customers.getSize() == 0) {
//            customers.addCustomerToList(customer);
//            System.out.println("First time? Continue to order with user name: " + customer.getName(customer));
//            save(customer.getName(customer));
//        } else {
//            if (customers.checkIfContains(customer)) {
//                System.out.println("Continue to order with user name: " + customer.getName(customer));
//            } else {
//                customers.addCustomerToList(customer);
//                System.out.println("First time? Continue to order with user name: " + customer.getName(customer));
//            }
//        }
//    }


    private static void makeOrderBeefBurger() {
        boolean keepGoing = true;
        while (keepGoing) {
         //   BeefBurgerMenu.displayMenu();
            String command = input1.next();
            command = command.toLowerCase();
            if (command.equals("a")) {
                makeOrderAngusBeefBurger();
            } else if (command.equals("q")) {
                keepGoing = false;
            } else if (command.equals("r")) {
                makeOrderBurger();
            } else if (command.equals("p")) {
               // Order.printOrder(customer);
                //printOrder();
            } else {
                System.out.println("Selection not valid...");
            }
        }
       // kitchenPanel.update();
        // keepGoing = false;
        // System.out.println("\nThank you for ordering with automatic machine, goodbye!");
    }

//    public static void printOrder() {
//        for (Food food: foods) {
//            totalPrice = totalPrice + food.getPrice();
//        }
//        for (Food food : foods) {
//            System.out.println("You ordered: " + food.getName());
//        }
//        System.out.println("Your total is: " + totalPrice);
//        System.out.println("How would you like to pay? Pay here or pay at the front desk? (here or front)");
//        String operation = input3.nextLine();
//        operation.toLowerCase();
//        if (operation.equals("here")) {
//            System.out.println("Please use pin pad to pay for your order");
//        } else {
//            if (operation.equals("front")) {
//                System.out.println("Please take your receipt to the front desk to finalize your payment");
//            } else {
//        //        throw new SelectionNotValid();
//            }
//        }
//    }



    // Food beefBurger = new BeefBurger();

//        String operation = "";
//        System.out.println("Do you want some beef burgers?(Yes or No)");
//        Scanner scanner = new Scanner(System.in);
//        operation = scanner.nextLine();
//
//        if (operation.equals("Yes")) {
//            BeefBurger.printOrder();
//            System.out.println("Do you want angus beef burgers?(Yes or No)");
//            operation = scanner.nextLine();
//            if (operation.equals("Yes")) {
//                Burger.printOrder1();
//            }
//        } else {
//            makeOrderChickenBurger();
//        }


    private static void makeOrderAngusBeefBurger() {
        boolean keepGoing = true;
        String command = null;
        while (keepGoing) {
         //   AngusBeefBurger.printAngusBeefBurgerInfo();
            System.out.println("Do you want Angus Beef Burger?( y or n )");
            command = input1.next();
            command = command.toLowerCase();
            if (command.equals("y")) {
                pressY();
            } else if (command.equals("n")) {
                keepGoing = false;
            } else {
                System.out.println("Selection not valid...");
            }
            makeOrderBeefBurger();
        }
    }

//    public void printAngusBeefBurgerInfo() {
//        BeefBurger bb = new BeefBurger();
//        System.out.println(bb.printPrice1());
//        System.out.println(bb.printIngredient1());
//        System.out.println(bb.printPopularity1());
//    }

    private static void pressY() {
        System.out.println("you've successfully ordered Angus Beef Burger");
        //   order.addObserver(kitchenPedal);
        // Order.addOrderedFood(customer, new AngusBeefBurger());
        foods.add(new AngusBeefBurger());
        makeOrderBeefBurger();
    }

//    BeefBurger beefBurger = new BeefBurger();
//        beefBurger.printName1();
//        beefBurger.printPrice1();
//        beefBurger.printIngredient1();
//        beefBurger.printPopularity1();


//    private static void displayBeefBurgerMenu() {
//        System.out.println("\nSelect from:");
//        System.out.println("\ta -> Angus Beef Burger");
//        System.out.println("\tr -> Return");
//        System.out.println("\tp -> Ready to pay");
//        System.out.println("\tq -> quit");
//        // System.out.println("\tq -> quit");
//    }


    private static void makeOrderBurger() {
        boolean keepGoing = true;
        while (keepGoing) {
          //  BurgerMenu.displayMenu();
            String command = input1.next();
            command = command.toLowerCase();
            if (command.equals("b")) {
                makeOrderBeefBurger();
            } else if (command.equals("q")) {
                keepGoing = false;
            } else if (command.equals("r")) {
             //   makeOrderMainMenu();
            } else if (command.equals("p")) {
                Order.printOrder(customer);
            } else {
                // System.out.println("Selection not valid...");
            }
        }
        System.out.println("\nThank you for ordering with automatic machine, goodbye!");
    }

    //    keepGoing = false;
//} else if (command.equals("c")) {
//        makeOrderChickenBurger();


//    public void printOrderMain() {
//        for (String str : order) {
//            System.out.println("your order is " + str);
//        }
//    }

//    private static void displayBurgerMenu() {
//        System.out.println("\nSelect from:");
//        System.out.println("\tb -> Beef Burger");
//        System.out.println("\tc -> Chicken Burger");
//        System.out.println("\tr -> Return");
//        System.out.println("\tp -> Ready to pay");
//        // System.out.println("\tc -> Combo");
//        System.out.println("\tq -> quit");
//    }

    private static void makeOrderSnacks() {
      //  Food chickenStripes = new Snacks();
        String operation = "";
        System.out.println("Do you want a chickenStripes?(Yes or No)");
//        chickenStripes.printPrice1();
//        chickenStripes.printIngredient1();
//        chickenStripes.printPopularity1();
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextLine();

        if (operation.equals("Yes")) {
            Snacks.printOrder();
        //    Order.addOrderedFood(customer, "chickenStripes");
        } else {
           // say();
        }

    }

//    public void makeOrderChickenBurger() {
//        String operation = "";
//        System.out.println("Do you want some chicken burgers?(Yes or No)");
//        Scanner scanner = new Scanner(System.in);
//        operation = scanner.nextLine();
//
//        if (operation.equals("Yes")) {
//            ChickenBurger.printOrder();
//            System.out.println("Do you want classical chicken burgers?(Yes or No)");
//            operation = scanner.nextLine();
//            if (operation.equals("Yes")) {
//                ChickenBurger.printOrder1();
//            }
//        } else {
//            makeOrderSnacks();
//        }
//
//
//    }

//    public static void load() throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
//        PrintWriter writer = new PrintWriter("outputfile", "UTF-8");
////        lines.add("Mike 8.99");
//        for (String line : lines) {
//            ArrayList<String> partsOfLine = splitOnSpace(line);
//            System.out.print("Customer: " + partsOfLine.get(0) + "  ");
//            //      System.out.println("Balance: " + partsOfLine.get(1));
//            writer.println(line);
//        }
//        writer.close();
//    }
//
    public static ArrayList<String> splitOnSpace(String line) throws IOException {
        String[] splits = line.split(" ");
        return new ArrayList<>(Arrays.asList(splits));

    }

//    public static void save(String s) throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("inputfile"));
//        PrintWriter writer = new PrintWriter("inputfile", "UTF-8");
//        lines.add(s);
//        for (String line : lines) {
//            ArrayList<String> partsOfLine = splitOnSpace(line);
//            System.out.print("Customer: " + partsOfLine.get(0) + "  ");
//            System.out.println("Balance: " + partsOfLine.get(1));
//            writer.println(line);
//        }
//        writer.close();
//    }


    private static void print() {
        System.out.println("Welcome! Please input your name here");
    }

    private static void say() {
        System.out.println("You've done! Wait for your meal at front desk");
    }
}
