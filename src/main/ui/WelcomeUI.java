package ui;

import network.ReadWebPageEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class WelcomeUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel information;
    private JLabel weather;
    private JButton continueLogIn;

    public WelcomeUI() throws IOException {
        panel = new JPanel();
        add(panel);
        information = new JLabel();
        information.setText(ReadWebPageEx.getWelcomeLetter());

        weather = new JLabel();

        continueLogIn = new JButton("Continue");
        panel.add(continueLogIn);
        panel = new JPanel(new GridLayout(1, 1));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setTitle(ReadWebPageEx.getWelcomeLetter());
        setSize(450, 350);
        setVisible(true);

        continueLogIn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        remove(panel);
        LoginUI loginUI = new LoginUI();
        add(loginUI);
        pack();
    }
}
