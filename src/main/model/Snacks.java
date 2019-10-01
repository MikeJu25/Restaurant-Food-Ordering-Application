package model;

public class Snacks implements Food {

    public void chickenStripes() {
        printPrice1();
        printIngredient1();
    }

    public void chickenWings() {
        printPrice2();
        printIngredient2();
    }



    @Override
    public void printPrice1() {
        System.out.println("Price: $5.99");
    }

    @Override
    public void printPrice2() {
        System.out.println("Price: $8.99");
    }

    @Override
    public void printIngredient1() {
        System.out.println("Ingredient: High-quality Chicken Tenders, Salt, Plant Oil");
    }

    @Override
    public void printIngredient2() {
        System.out.println("Ingredient: Fresh Chicken Wings, Salt, Pepper");
    }

    @Override
    public void printPopularity1() {
        System.out.println("Star: ***");
    }

    @Override
    public void printPopularity2() {
        System.out.println("Star: ****");
    }
}
