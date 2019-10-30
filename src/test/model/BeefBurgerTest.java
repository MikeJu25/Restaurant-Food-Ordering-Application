package model;

import model.BeefBurger;
import model.Burger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

public class BeefBurgerTest {
    private BeefBurger beefBurger1;
    private BeefBurger beefBurger2;
    private Customer customer1;
    private Customer customer2;
    private ArrayList<Customer> customers;
    private ArrayList<BeefBurger> beefBurgers;

    @BeforeEach
    public void runBefore(){
        beefBurger1 = new BeefBurger();
        beefBurger2 = new BeefBurger();
        customer1 = new Customer("Mike",0);
        customer2 = new Customer("Mi",0);
        customers = new ArrayList<>();
        beefBurgers = new ArrayList<>();
    }

    @Test
    public void testPrintPrice1(){
        assertEquals("$23.99",beefBurger1.printPrice1());
    }

    @Test
    public void testPrintIngredient1(){
        assertEquals("Angus beef, butter, exclusive chess, oat bread cover",beefBurger1.printIngredient1());
    }

    @Test
    public void testPopularity1() {
        BurgerMenu.displayMenu();
        assertEquals("****",beefBurger1.printPopularity1());
    }

    @Test
    public void testAddRepeatedCustomer(){
        customers.add(customer1);
        beefBurger1.addCustomer(customer1);
        assertFalse(beefBurgers.contains(beefBurger1));
    }

    @Test
    public void testPrintName1(){
        assertEquals("Angus Beef Burger",beefBurger1.printName1());
    }

    @Test
    public void testPrintOrder(){
        assertEquals("Choose one burger below",beefBurger1.printOrder());
    }

    @Test
    public void testPrintOrder1(){
        assertEquals(null,beefBurger1.printOrder1());
    }

}
