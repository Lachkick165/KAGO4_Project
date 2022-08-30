import javax.swing.*;
import java.sql.Time;

public class MainProgrem {

    public static void main(String[] args) {
        System.out.println("hihi");

        Property p1 = new Property("Erzbergerstraße 1", 20, 20.5);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("Erzbergerstraße 2", 40, 40.5);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");


       /*int Timer = 6;

        System.out.println(Timer);
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(500, 500, 100, 100);

        frame.repaint();

        while (Timer >= 5){

            return;
        }
        frame.setVisible(false);*/
    }



}
