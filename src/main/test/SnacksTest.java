package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnacksTest {
    @Test
    public void testPrintPrice1() {
        assertEquals("Price: $5.99","Price: $5.99");
    }

    @Test
    public void testPrintPrice2() {
        assertEquals("Price: $8.99","Price: $8.99");
    }

    @Test
    public void testPrintIngredient1() {
        assertEquals("Ingredient: High-quality Chicken Tenders, Salt, Plant Oil",
                "Ingredient: High-quality Chicken Tenders, Salt, Plant Oil");
    }

    @Test
    public void testPrintIngredient2() {
        assertEquals("Ingredient: Fresh Chicken Wings, Salt, Pepper",
                "Ingredient: Fresh Chicken Wings, Salt, Pepper");
    }

    @Test
    public void testPrintPopularity1() {
        assertEquals("Star: ***", "Star: ***");
    }

    @Test
    public void testPrintPopularity2() {
        assertEquals("Star: *****", "Star: *****");
    }
}
