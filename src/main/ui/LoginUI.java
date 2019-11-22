package ui;

import exception.RepeatedName;
import exception.TooLongName;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static model.Name.checkNameLegal;


public class LoginUI extends JFrame implements ActionListener {

    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel message;
    private JTextField userNameText;
    private JButton submit;
    //private Frame frame = new Frame();

    LoginUI() {
        panel = new JPanel();
        add(panel);

        // Username Label
        userLabel = new JLabel();
        userLabel.setText("User Name :");
        userNameText = new JTextField();

        // Password Label

        passwordLabel = new JLabel();
        passwordLabel.setText("Password :");
       // passwordText = new JPasswordField();

        // Submit

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(userLabel);
        panel.add(userNameText);
        panel.add(passwordLabel);
       // panel.add(passwordText);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        pack();

        setTitle("Welcome! Please input your name here");
        setSize(450, 350);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userNameText.getText();
        try {
            if (checkNameLegal(userName)) {
                //customer = new Customer(operation, 0);
                //dispose();
                MembershipUI ms = new MembershipUI(this);
                remove(panel);
                add(ms);
                pack();
            }
        } catch (TooLongName tooLongName) {
            tooLongName.printStackTrace();
        } catch (RepeatedName repeatedName) {
            repeatedName.printStackTrace();
        }
    }

}

//try {
//        if (checkNameLegal(userName)) {
//        //customer = new Customer(operation, 0);
//        //dispose();
//        MembershipUI ms = new MembershipUI(this);
//        remove(panel);
//        add(ms);
//        pack();
//        }
//        } catch (TooLongName tooLongName) {
//        tooLongName.printStackTrace();
//        } catch (RepeatedName repeatedName) {
//        repeatedName.printStackTrace();
//        }
//        }