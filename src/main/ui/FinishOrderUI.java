package ui;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class FinishOrderUI extends JFrame {
    private Image img;

    public FinishOrderUI() throws IOException {
        String theUrl = "https://image.shutterstock.com/image-vector/goodbye-isolated-vector-illustration-word-260nw-797705239.jpg";
        URL url = new URL(theUrl);
        img = Toolkit.getDefaultToolkit().getImage(url);

        this.setContentPane(new JPanel() {
                    @Override
                    public void paintComponent(Graphics g) {
                        super.paintComponent(g);
                g.drawImage(img, 175, 75, null);
            }
        });
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(950, 550);
        setVisible(true);

        setTitle("Thank you for ordering with automatic ordering application!");

    }


}
