package model;

import model.Combo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComboTest {
    private Combo combo;

    @BeforeEach
    public void runBefore(){
        combo = new Combo();
    }

    @Test
    public void testPrintTips(){
        combo.combo1();
        assertEquals(combo.printTips(),"Grab a cup near the front desk");
    }

    @Test
    public void testPrintPrice1(){
        assertEquals(combo.printPrice1(),"$12.99");
    }

    @Test
    public void testPrintIngredient1(){
        assertEquals(combo.printIngredient1(),"Chicken Stripes + Chicken Wings + Coke Zero");
    }

    @Test
    public void testPrintPopularity(){
        assertEquals(combo.printPopularity1(),"**");
    }
}
