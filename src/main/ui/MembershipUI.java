package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MembershipUI extends JPanel implements ActionListener {
    private JPanel panel;
//    private JLabel yesLable;
//    private JLabel noLable;
    private JLabel message;
    private JButton membership;
    private JButton visit;


//    public static void showMembershipUI() {
//        //Create and set up the window.
    JFrame frame = new JFrame("Automatic Ordering Machine");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Add content to the window.
//        frame.add(new MembershipUI());
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }

    public MembershipUI(JFrame frame) {
        panel = new JPanel();
        message = new JLabel();
        message.setText("Do you want to order with membership or visitor");

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
        frame.remove(this);

        frame.pack();

    }
}
