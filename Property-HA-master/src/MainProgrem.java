import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainProgrem {

    JFrame window;
    JLabel counterLabel;
    Font font1 = new Font("Arial", Font.PLAIN, 70);

    Timer timer;
    int second;

    public static void main(String[] args) {
        new MainProgrem();

        System.out.println("hihi");

        Property p1 = new Property("Erzbergerstraße 1", 20, 20.5);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("Erzbergerstraße 2", 40, 40.5);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");

        Property p3 = new Property("Erzbergerstraße 3", 60, 60.5);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");

        Property p4 = new Property("Erzbergerstraße 4", 80, 80.5);
        System.out.println(p4.getAddress() + " - " + p4.getSize() + "m²");

        Property p5 = new Property("Erzbergerstraße 5", 100, 100.5);
        System.out.println(p5.getAddress() + " - " + p5.getSize() + "m²");

        Stairs s1 = new Stairs("left", 20, 10);
        System.out.println(s1.getPosition() + " - " + s1.getSize() + "m²");

        Stairs s2 = new Stairs("left", 30, 20);
        System.out.println(s2.getPosition() + " - " + s2.getSize() + "m²");

        Stairs s3 = new Stairs("left", 40, 50);
        System.out.println(s3.getPosition() + " - " + s2.getSize() + "m²");
    }

    public MainProgrem() {

        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        counterLabel = new JLabel("");
        counterLabel.setBounds(300, 230, 200, 100);
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        counterLabel.setFont(font1);

        window.add(counterLabel);
        window.setVisible(true);

        second = 6;
        simpleTimer();
        timer.start();
    }

    public void simpleTimer(){
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                second--;

                counterLabel.setText(""+ second);

                if(second==0){
                    second = 7;
                    window.setVisible(false);
                    window.dispose();
                }

                if(second==6){
                    timer.stop();
                }
            }
        });
    }
}



















