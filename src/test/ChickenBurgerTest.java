import model.BeefBurger;
import model.Burger;
import model.ChickenBurger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenBurgerTest {
    private Burger chickenBurger;

    @BeforeEach
    public void runBefore(){
        chickenBurger = new ChickenBurger();
    }

    @Test
    public void testPrintPrice1(){
        assertEquals("$17.39",chickenBurger.printPrice1());
    }

    @Test
    public void testPrintIngredient1(){
        assertEquals("Free run chicken, organic plant oil, oat or white bread",
                chickenBurger.printIngredient1());
    }

    @Test
    public void testPopularity1(){
        assertEquals("*****",chickenBurger.printPopularity1());
    }

    @Test
    public void testPrintName1(){
        assertEquals("Classical Chicken Burger",chickenBurger.printName1());
    }

    @Test
    public void testPrintOrder(){
        assertEquals("Choose one burger below",chickenBurger.printOrder());
    }
}
