package model;

import model.Food;
import model.Snacks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnacksTest {

    private Food snacks;

    @BeforeEach
    public void runBefore(){
        snacks = new Snacks();
    }

    @Test
    public void testPrintPrice1() {
        assertEquals("Price: $5.99",snacks.printPrice1());
    }

//    @Test
//    public void testPrintPrice2() {
//        assertEquals("Price: $8.99",snacks.printPrice2);
//    }

    @Test
    public void testPrintIngredient1() {
        assertEquals("Ingredient: High-quality Chicken Tenders, Salt, Plant Oil",
                snacks.printIngredient1());
    }

//    @Test
//    public void testPrintIngredient2() {
//        assertEquals("Ingredient: Fresh Chicken Wings, Salt, Pepper",
//                "Ingredient: Fresh Chicken Wings, Salt, Pepper");
//    }

    @Test
    public void testPrintPopularity1() {
        assertEquals("Star: ***", snacks.printPopularity1());
    }

//    @Test
//    public void testPrintPopularity2() {
//        assertEquals("Star: *****", "Star: *****");
//    }

//    @Test
//    public void testPrintOrder() {
//        assertEquals("Star: ***", snacks.printOrder());
//    }
}
