package ui;

import exception.RepeatedName;
import exception.SelectionNotValid;
import exception.TooLongName;
import model.Customer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static model.Name.checkNameLegal;


public class LoginUI extends JFrame implements ActionListener {

    public static String userName;
    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel message;
    public static JTextField userNameText;
    private JButton submit;
    private JLabel tooLongNameWarning;
    //private Frame frame = new Frame();

    LoginUI() {
        panel = new JPanel();
        add(panel);

        // Username Label
        userLabel = new JLabel();
        userLabel.setText("Welcome! Please in put your Name :");
        userNameText = new JTextField();

        // Password Label

        // passwordText = new JPasswordField();
        tooLongNameWarning = new JLabel();
        tooLongNameWarning.setText("Your input name is too long, change to another one");
        // Submit

        submit = new JButton("SUBMIT");

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(userLabel);
        panel.add(userNameText);
        // panel.add(passwordText);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        pack();

        setTitle("Name Input");
        setSize(450, 250);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        userName = userNameText.getText();
        try {
            if (checkNameLegal(userName)) {

               // MidiSynth.play(2,3,44);
                new MembershipUI(this);
              //  remove(panel);
                dispose();
             //   MembershipUI.showMembershipUI(this);
              //  add(ms);
              //  pack();
//                this.dispose();
            }
        } catch (TooLongName tooLongName) {
           // setSize(450, 350);
            panel.add(tooLongNameWarning);
            pack();
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