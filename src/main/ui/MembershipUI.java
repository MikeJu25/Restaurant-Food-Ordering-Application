package ui;

import exception.SelectionNotValid;
import model.Customer;
import model.Customers;
import model.Name;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static ui.MakeOrder.makeOrderMainMenu;

public class MembershipUI extends JFrame implements ActionListener {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    // private static JFrame frame;
    //    private JLabel yesLable;
//    private JLabel noLable;
    private JLabel message;
    private JLabel firstTimeMessage;
    private JLabel isThisYourAccountMessage;
    private JLabel hasBeenRegistered;
    private JLabel nameSuggestion;
    private JButton membership;
    private JButton visitor;
    private JButton makeChoiceToContinue;
    private JButton stillVisitor;
    private JButton continueToOrder;
    private JButton notMyAccount;
    private Customers customers;


//    public static void showMembershipUI() {
//        //Create and set up the window.
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Add content to the window.
//        frame.add(new MembershipUI());
//    }

    public MembershipUI(JFrame frame) throws IOException {
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        makeChoiceToContinue = new JButton("That's it! I want this user name and ready to order");
        stillVisitor = new JButton("I don't want this name. I just wanna see my menu");
        continueToOrder = new JButton("Continue");
        notMyAccount = new JButton("This is not my account");
        hasBeenRegistered = new JLabel("Sorry, this user name has been registered");
        nameSuggestion = new JLabel();
        customers = new Customers();


        isThisYourAccountMessage = new JLabel();

        frame.add(panel1);
        message = new JLabel();
        message.setText("Do you want to order with membership or visitor");
        firstTimeMessage = new JLabel();
        membership = new JButton("Membership");
        visitor = new JButton("Visitor");


        panel1.setLayout(new GridLayout(0, 1));
        panel1.setSize(new Dimension(10, 10));
        panel2.setLayout(new GridLayout(3, 1));
        panel2.setSize(new Dimension(10, 10));
        panel3.setLayout(new GridLayout(4, 1));
        panel3.setSize(new Dimension(10, 10));
        panel3.add(hasBeenRegistered);
        legalNameSuggestion();
        panel3.add(nameSuggestion);
        panel3.add(makeChoiceToContinue);
        panel3.add(stillVisitor);
        panel1.add(message);
        panel1.add(membership);
        panel1.add(visitor);

        membership.addActionListener(this);
        visitor.addActionListener(this);
        makeChoiceToContinue.addActionListener(this);
        stillVisitor.addActionListener(this);
        continueToOrder.addActionListener(this);
        notMyAccount.addActionListener(this);
        add(panel1, BorderLayout.CENTER);

        setTitle("Identification Verification");
        setSize(450, 250);
        setVisible(true);


//        this.frame = frame;
//        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
//        htmlTextArea = new JTextArea(10, 20);
//        htmlTextArea.setText(initialText);
//        JButton changeTheLabel = new JButton("Change the label");
//        changeTheLabel.setMnemonic(KeyEvent.VK_C);
//        changeTheLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        changeTheLabel.addActionListener(this);
    }


    public void legalNameSuggestion() throws IOException {
        customers.load();
        String goodName = "";
        for (int i = 2; i <= 20000; ) {
            if (!Customers.getAllCustomersName().contains(LoginUI.userName + i)) {
                goodName = LoginUI.userName + i;
                nameSuggestion.setText("This is our suggestions: " + goodName);
                break;
            } else {
                i++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbutton = (JButton) e.getSource();
        // System.out.println(jbutton.getText());
        if (jbutton.getText() == "Membership") {
            try {
                checkName(LoginUI.userName, customers);
                // checkName(LoginUI.userName, customers);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        // new CheckNameUI();
        if (jbutton.getText() == "Visitor") {
            dispose();
            new MenuUI();
        }
        if (jbutton.getText() == "Continue") {
            dispose();
            new MenuUI();
        }
        if (jbutton.getText() == "This is not my account") {
            remove(panel2);
            add(panel3);
            pack();
        }
        if (jbutton.getText() == "That's it! I want this user name and ready to order") {
            try {
                customers.save();
                dispose();
                new MenuUI();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (jbutton.getText() == "I don't want this name. I just wanna see my menu") {
            dispose();
            new MenuUI();
        }
    }


    public void checkName(String customerName, Customers customers) throws IOException {
        // ArrayList<String> names = new ArrayList<String>();
        // customer.extractName(customers);
        //order.addCustomer(customer);
        customers.load();
        if (customers.getSize() == 0) {
            //make object here and add to customer list
            Customer firstCustomer = new Customer(customerName, 0);
            Customers.addCustomerToList(firstCustomer);
            firstTimeMessage.setText("First time? Continue to order with user name: " + firstCustomer.getName());
            panel1.add(firstTimeMessage);
            // System.out.println("First time? Continue to order with user name: " + firstCustomer.getName());
            customers.save();
        } else {
            if (Customers.getAllCustomersName().contains(customerName)) {
                Customer customer = ifContains(customerName);
                remove(panel1);
                firstTimeMessage.setText("Continue to order with user name: " + customer.getName());
                add(panel2, BorderLayout.CENTER);
                panel2.add(firstTimeMessage);
                panel2.add(continueToOrder);
                panel2.add(notMyAccount);
                pack();
                // pack();
                //System.out.println("Your current account balance: " + customer.getBalance());
            } else {
                System.out.println("Create an account and continue to order with user name: " + customerName);
                Customer newCustomer = new Customer(customerName, 0);
                Customers.addCustomerToList(newCustomer);
                customers.save();
            }
        }
    }


    public Customer ifContains(String customerName) throws SelectionNotValid, IOException {
        //System.out.println("Is this your account: " + customerName);
        isThisYourAccountMessage.setText("Is this your account: " + customerName);

//        if (command.equals("y")) {
//            System.out.println("Continue to order with user name: " + customerName);
//            // order.addCustomer(Customers.getCustomerWithName(customerName));
//            return Customers.getCustomerWithName(customerName);
//        } else if (command.equals("n")) {
//            System.out.println("This name has been registered. Enter another one to make a new account");
//            System.out.println("Here are our suggestions: "
//                    + customerName + "2  Do you want it to be your user name? (y or n)");
//            String command2 = input2.next();
//            if (command2.equals("y")) {
//                ifY(customerName + "2");
//            }
//        } else {
//            throw new SelectionNotValid();
//        }
        return new Customer("Mike", 12);
    }
}
