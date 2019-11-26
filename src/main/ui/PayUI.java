package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PayUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel totalPrice;
    private JLabel message;
    private JButton payHere;
    private JButton payAtFront;

    public PayUI() {
        panel = new JPanel();
        totalPrice = new JLabel("Your total is " + MenuUI.totalPriceCalculator());
        payAtFront = new JButton("Pay at the front desk");
        payHere = new JButton("Pay by debit or credit");
        message = new JLabel("Please take your number and pay at the front desk");

        add(panel);
        panel.add(totalPrice);
        panel.add(payAtFront);
        panel.add(payHere);

        setTitle("Pay The Bill");
        setSize(450, 250);
        setVisible(true);

        panel.setLayout(new GridLayout(4,1));

        payHere.addActionListener(this);
        payAtFront.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbutton = (JButton) e.getSource();
        if (jbutton.getText() == "Pay at the front desk") {
            panel.removeAll();
            panel.add(message);
            pack();
            try {
                new FinishOrderUI();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
