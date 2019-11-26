package ui;

import network.ReadWebPageEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;


public class WelcomeUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel information;
    private JLabel producer;
    private JButton continueLogIn;
    private CardLayout cardLayout;
    private Container container;

//    private Image img;
//    private String theUrl = "http://images.clipartpanda.com/apple-20clip-20art-nicubunu_Apple_Clipart_Free.png";
//    private URL url = new URL(theUrl);

    public WelcomeUI() throws IOException {
        panel = new JPanel();
        add(panel);
        information = new JLabel();
        information.setText(ReadWebPageEx.getWelcomeLetter());
        cardLayout = new CardLayout(30, 40);
        container = getContentPane();
        container.setLayout(cardLayout);
//        img = Toolkit.getDefaultToolkit().getImage(url);
//
//        this.setContentPane(new JPanel() {
//            @Override
//            public void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.drawImage(img, 0, 0, null);
//            }
//        });


        producer = new JLabel();
        producer.setText("Producer: Mike Ju");
        panel.add(producer);
        panel.setLayout(new GridLayout(2, 1));
        setTitle("Welcome to the CPSC 210 Project for 2018W1!");

        continueLogIn = new JButton("Continue");
        panel.add(continueLogIn);
        //  panel = new JPanel(new CardLayout(40, 30));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setTitle(ReadWebPageEx.getWelcomeLetter());
        setSize(450, 250);
        setVisible(true);

        continueLogIn.addActionListener(this);

    }

    public static void playSound(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // remove(panel);
        playSound("buzzer.wav");
        dispose();
        new LoginUI();
        //add(loginUI);
        pack();
    }
}
