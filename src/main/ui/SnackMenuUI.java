package ui;

import model.ChickenStripe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnackMenuUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JPanel panelMainMenu;
    private JPanel chickenStripePanel;
    private JPanel angusBeefBurgerMenu;
    private JLabel price;
    private JLabel ingredient;
    private JLabel addToCartMessage;
    //  private JLabel burger;
    private JButton chickenStripe;
    private JButton angusBeefBurger;
    private JButton chickenBurger;
    private JButton classicalChickenBurger;
    private JButton addToCart;
    private JButton backToSnack;
    private JButton readyToPay;
    
    public SnackMenuUI() {
        panel = new JPanel();
        chickenStripePanel = new JPanel();
//        panelBeefBurgerMenu.add(angusBeefBurger);
//        angusBeefBurgerMenu = new JPanel();
//        angusBeefBurgerMenu.add(addToCart);
        price = new JLabel("Price: $9.99");
        ingredient = new JLabel(ChickenStripe.ingredient);
        addToCartMessage = new JLabel("You've successfully ordered chicken stripe");
        readyToPay = new JButton("Ready to pay");
        backToSnack = new JButton("Return");
        addToCart = new JButton("Add to cart");

        panel.setLayout(new GridLayout(4,1));
        chickenStripePanel.setLayout(new GridLayout(5,1));
        chickenStripePanel.add(price);
        chickenStripePanel.add(ingredient);
        chickenStripePanel.add(addToCart);
        chickenStripePanel.add(backToSnack);
        
        
        add(panel);
        chickenStripe = new JButton("Chicken Stripe");
//        angusBeefBurger = new JButton("Angus Beef Burger");
//        chickenBurger = new JButton("Chicken Burger");
//        classicalChickenBurger = new JButton("Classical Chicken Burger");
        
        panel.add(chickenStripe);
        panel.add(readyToPay);
      //  panel.add(chickenBurger);
        
        chickenStripe.addActionListener(this);
//        angusBeefBurger.addActionListener(this);
//        chickenBurger.addActionListener(this);
//        classicalChickenBurger.addActionListener(this);
        addToCart.addActionListener(this);
        readyToPay.addActionListener(this);
        backToSnack.addActionListener(this);

        setTitle("Snack Menu");
        setSize(450, 250);
        setVisible(true);

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbutton = (JButton) e.getSource();
        if (jbutton.getText() == "Chicken Stripe") {
            remove(panel);
            add(chickenStripePanel);
            pack();
        }
        if (jbutton.getText() == "Add to cart") {
            MainMenuUI.foods.add(new ChickenStripe());
            chickenStripePanel.add(addToCartMessage);
            pack();
        }
        if (jbutton.getText() == "Ready to pay") {
            dispose();
            new PayUI();
        }
        if (jbutton.getText() == "Return") {
            remove(chickenStripePanel);
            add(panel);
            pack();
        }
    }
}
