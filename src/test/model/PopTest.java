package model;

import model.Drinks;
import model.Pop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopTest {
    private Drinks pop;

    @BeforeEach
    public void runBefore(){
        pop = new Pop();
    }

    @Test
    public void testPrintTips(){
        assertEquals(pop.printTips(),"Get a cup near front desk");
    }

//    @Test
//    public void testCokeZero(){
//        assertEquals("Get a cup near front desk",pop.cokeZero());
//    }
}
