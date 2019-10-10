package model;

public class Snacks implements Food {


//    public void chickenStripes() {
////        printPrice1();
////        printIngredient1();
////        printPopularity1();
////    }
////
////    public void chickenWings() {
////        printPrice2();
////        printIngredient2();
////        printPopularity2();
////    }

//    public static void makeOrder() {
//        Food chickenStripes = new Snacks();
//        String operation = "";
//        System.out.println("Do you want a chickenStripes?(Yes or No)");
//        chickenStripes.printPrice1();
//        chickenStripes.printIngredient1();
//        chickenStripes.printPopularity1();
//        Scanner scanner = new Scanner(System.in);
//        operation = scanner.nextLine();
//
//        if (operation.equals("Yes")) {
//            printOrder();
//            order.add("chickenStripes");
//        } else {
//            makeOrder();
//        }
//
//    }

    public static String printOrder() {
        return ("You've successfully ordered chicken stripes!");
    }

    @Override
    public String printPrice1() {
        return ("Price: $5.99");
    }

//    @Override
//    public void printPrice2() {
//        System.out.println("Price: $8.99");
//    }

    @Override
    public String printIngredient1() {
        return ("Ingredient: High-quality Chicken Tenders, Salt, Plant Oil");
    }

//    @Override
//    public void printIngredient2() {
//        System.out.println("Ingredient: Fresh Chicken Wings, Salt, Pepper");
//    }

    @Override
    public String printPopularity1() {
        return ("Star: ***");
    }
}

//    @Override
//    public void printPopularity2() {
//        System.out.println("Star: ****");
//    }
//}
