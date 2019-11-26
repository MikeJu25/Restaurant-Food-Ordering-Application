package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckNameUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton yes;
    private JButton no;
    private JLabel isThisYourAccountMessage;

    public CheckNameUI() {
        panel = new JPanel();
        add(panel);
        yes = new JButton("Yes");
        no = new JButton("no");
        isThisYourAccountMessage = new JLabel();

        panel.add(yes);
        panel.add(no);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jbutton = (JButton) e.getSource();
        if (jbutton.getText() == "Yes") {
            new MenuUI();
        }
    }
}
