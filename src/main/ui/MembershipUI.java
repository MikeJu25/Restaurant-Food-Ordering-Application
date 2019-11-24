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
    private JPanel panel;
   // private static JFrame frame;
    //    private JLabel yesLable;
//    private JLabel noLable;
    private JLabel message;
    private JLabel firstTimeMessage;
    private JButton membership;
    private JButton visitor;
    private JButton yes;
    private JButton no;
    private Name name;
    private Customers customers;


//    public static void showMembershipUI() {
//        //Create and set up the window.
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Add content to the window.
//        frame.add(new MembershipUI());
//    }

    public MembershipUI(JFrame frame) {
        panel = new JPanel();
        frame.add(panel);
        frame.setTitle("");
        message = new JLabel();
        message.setText("Do you want to order with membership or visitor");
        firstTimeMessage = new JLabel();
        membership = new JButton("Membership");
        visitor = new JButton("Visitor");
        yes = new JButton("Yes");
        no = new JButton("No");

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        panel.setSize(new Dimension(10, 10));
        panel.add(message);
        panel.add(membership);
        panel.add(visitor);

        membership.addActionListener(this);
        visitor.addActionListener(this);
        add(panel, BorderLayout.CENTER);

        setTitle("Name Input");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbutton = (JButton) e.getSource();
       // System.out.println(jbutton.getText());
        if (jbutton.getText() == "Membership") {
            try {
                checkName(LoginUI.userName, customers);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            makeOrderMainMenu();
        }
        if (jbutton.getText() == "Visitor") {
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
            panel.add(firstTimeMessage);
            // System.out.println("First time? Continue to order with user name: " + firstCustomer.getName());
            customers.save();
        } else {
            if (Customers.getAllCustomersName().contains(customerName)) {
                Customer customer = ifContains(customerName);
                firstTimeMessage.setText("First time? Continue to order with user name: " + customer.getName());
                panel.add(firstTimeMessage);
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
        System.out.println("Is this your account: " + customerName);
        panel.add(yes);
        panel.add(no);
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
        return null;
//    }
    }
}
