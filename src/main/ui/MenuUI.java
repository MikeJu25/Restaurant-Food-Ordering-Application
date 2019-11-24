package ui;

import model.AngusBeefBurger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI extends JFrame implements ActionListener {
    private JPanel panelMainMenu;
    private JPanel panelBurgerMenu;
    private JPanel angusBeefBurgerMenu;
    private JLabel price;
    private JLabel ingredient;
  //  private JLabel burger;
    private JButton burger;
    private JButton angusBeefBurger;
    private JButton addToCart;
    private JButton backToBeefBurger;

    public MenuUI() {
        panelMainMenu = new JPanel();
        panelBurgerMenu = new JPanel();
        angusBeefBurgerMenu = new JPanel();
        burger = new JButton();
        angusBeefBurger = new JButton();
        price = new JLabel("Price: $23.99");
        addToCart = new JButton("Add to cart");
        backToBeefBurger = new JButton("Return");

        burger.setText("Burger Menu");
        angusBeefBurger.setText("Angus Beef Burger");

        add(panelMainMenu);
        panelMainMenu.add(burger);
        panelBurgerMenu.add(angusBeefBurger);
        angusBeefBurgerMenu.add(price);
        angusBeefBurgerMenu.add(addToCart);
        angusBeefBurgerMenu.add(backToBeefBurger);

        panelMainMenu.setLayout(new GridLayout(4,1));
        panelBurgerMenu.setLayout(new GridLayout(4,1));
        angusBeefBurgerMenu.setLayout(new GridLayout(3,1));
        burger.addActionListener(this);
        angusBeefBurger.addActionListener(this);
        backToBeefBurger.addActionListener(this);


        setTitle("Main Menu");
        setSize(450, 250);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbutton = (JButton) e.getSource();
        if (jbutton.getText() == "Burger Menu") {
            remove(panelMainMenu);
            add(panelBurgerMenu);
            setTitle("Burger Menu");
            setSize(450, 250);
            setVisible(true);
            pack();
        }
        if (jbutton.getText() == "Angus Beef Burger") {
            remove(panelBurgerMenu);
            add(angusBeefBurgerMenu);
            setTitle("Angus Beef Burger");
            pack();
        }
        if (jbutton.getText() == "Return") {
            remove(angusBeefBurgerMenu);
            add(panelBurgerMenu);
            setTitle("Burger Menu");
            pack();
        }
    }
}
