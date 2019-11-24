package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUI extends JFrame implements ActionListener {
    private JPanel panelMainMenu;
    private JPanel panelBurgerMenu;
  //  private JLabel burger;
    private JButton burger;
    private JButton angusBeefBurger;

    public MenuUI() {
        panelMainMenu = new JPanel();
        panelBurgerMenu = new JPanel();
        burger = new JButton();
        angusBeefBurger = new JButton();

        burger.setText("Burger Menu");
        angusBeefBurger.setText("Angus Beef Burger");

        add(panelMainMenu);
        panelMainMenu.add(burger);
        panelBurgerMenu.add(angusBeefBurger);

        panelMainMenu.setLayout(new GridLayout(4,1));
        burger.addActionListener(this);

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
            pack();
        }
    }
}
