package ui;

import exception.TooLongName;
import model.Customer;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Objects;
import javax.swing.*;

import static model.Name.checkNameLegal;


public class LoginUI extends JFrame implements ActionListener {

    static String userName;
    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel message;
    private static JTextField userNameText;
    private JButton submit;
    private JLabel tooLongNameWarning;
    private JLabel emptyNameWarning;
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
        emptyNameWarning = new JLabel("Please enter a valid name");
        // Submit

        submit = new JButton("SUBMIT");
        setLocation(500,300);

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
    // EFFECTS: When submit is clicked, if input is null, print the error message to the panel; if input is longer
    //          than 10 characters, print the warning message to the panel; otherwise get into a new membership UI
    public void actionPerformed(ActionEvent ae) {
        userName = userNameText.getText();
        WelcomeUI.playSound("./data/buzzer.wav");
        if (Objects.equals(userName, "")) {
            panel.add(emptyNameWarning);
        }
        try {
            if (checkNameLegal(userName)) {
                dispose();
               // MidiSynth.play(2,3,44);
                new MembershipUI(this);
              //  remove(panel);
             //   MembershipUI.showMembershipUI(this);
              //  add(ms);
              //  pack();
//                this.dispose();
            }
        } catch (TooLongName tooLongName) {
           // setSize(450, 350);
            panel.add(tooLongNameWarning);
            pack();
//        } catch (RepeatedName repeatedName) {
//           // repeatedName.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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