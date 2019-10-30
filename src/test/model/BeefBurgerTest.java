package model;

import model.BeefBurger;
import model.Burger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeefBurgerTest {
    private Burger beefBurger;

    @BeforeEach
    public void runBefore(){
        beefBurger = new BeefBurger();
    }

    @Test
    public void testPrintPrice1(){
        assertEquals("$23.99",beefBurger.printPrice1());
    }

    @Test
    public void testPrintIngredient1(){
        assertEquals("Angus beef, butter, exclusive chess, oat bread cover",beefBurger.printIngredient1());
    }

    @Test
    public void testPopularity1() {
        BurgerMenu.displayMenu();
        assertEquals("****",beefBurger.printPopularity1());
    }

    @Test
    public void testPrintName1(){
        assertEquals("Angus Beef Burger",beefBurger.printName1());
    }

    @Test
    public void testPrintOrder(){
        assertEquals("Choose one burger below",beefBurger.printOrder());
    }

    @Test
    public void testPrintOrder1(){
        assertEquals(null,beefBurger.printOrder1());
    }

}
