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
    private JButton returnTo;
    private JButton readyToPay;
    private JButton backToSnack;
    
    SnackMenuUI() {
        panel = new JPanel();
        chickenStripePanel = new JPanel();
//        panelBeefBurgerMenu.add(angusBeefBurger);
//        angusBeefBurgerMenu = new JPanel();
//        angusBeefBurgerMenu.add(addToCart);
        price = new JLabel("Price: $9.99");
        ingredient = new JLabel(ChickenStripe.ingredient);
        addToCartMessage = new JLabel("You've successfully ordered chicken stripe");
        readyToPay = new JButton("Ready to pay");
        returnTo = new JButton("Return");
        addToCart = new JButton("Add to cart");
        backToSnack = new JButton("Back");

        panel.setLayout(new GridLayout(4,1));
        chickenStripePanel.setLayout(new GridLayout(5,1));
        chickenStripePanel.add(price);
        chickenStripePanel.add(ingredient);
        chickenStripePanel.add(addToCart);
        chickenStripePanel.add(backToSnack);
        
        
        add(panel);
        chickenStripe = new JButton("Chicken Stripe");
        chickenStripePanel.setPreferredSize(new Dimension(450,250));
        panel.setPreferredSize(new Dimension(450,250));
//        angusBeefBurger = new JButton("Angus Beef Burger");
//        chickenBurger = new JButton("Chicken Burger");
//        classicalChickenBurger = new JButton("Classical Chicken Burger");
        
        panel.add(chickenStripe);
        panel.add(returnTo);
        panel.add(readyToPay);

      //  panel.add(chickenBurger);
        
        chickenStripe.addActionListener(this);
//        angusBeefBurger.addActionListener(this);
//        chickenBurger.addActionListener(this);
//        classicalChickenBurger.addActionListener(this);
        addToCart.addActionListener(this);
        readyToPay.addActionListener(this);
        returnTo.addActionListener(this);
        backToSnack.addActionListener(this);

        setTitle("Snack Menu");
        setSize(450, 250);
        setVisible(true);
        setLocation(500,300);

    }
    
    
    @Override
    //EFFECTS: if chicken stripe is clicked, remove snack menu and enter into a chicken stripe menu; if add to cart
    //         is clicked, add chicken stripe to foods and print add successful message; otherwise, call more
    //         possibility to react to more button choices
    public void actionPerformed(ActionEvent e) {
        WelcomeUI.playSound("./data/buzzer.wav");
        JButton jbutton = (JButton) e.getSource();
        if (jbutton.getText() == "Chicken Stripe") {
            remove(panel);
            add(chickenStripePanel);
//            chickenStripePanel.updateUI();
//            panel.updateUI();
            pack();
        }
        if (jbutton.getText() == "Add to cart") {
            MainMenuUI.foods.add(new ChickenStripe());
            chickenStripePanel.add(addToCartMessage);
            pack();
        }
        morePossiblity(jbutton);
    }

    private void morePossiblity(JButton jbutton) {
        if (jbutton.getText() == "Ready to pay") {
            dispose();
            new PayUI();
        }
        if (jbutton.getText() == "Return") {
//            remove(chickenStripePanel);
//            add(panel);
//            pack();
            dispose();
            new MainMenuUI();
        }
        if (jbutton.getText() == "Back") {
            remove(chickenStripePanel);
            add(panel);
            pack();
        }
    }
}
