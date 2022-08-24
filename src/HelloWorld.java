import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        int Timer = 5;
        System.out.println(Timer);
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(1000, 500, 150, 150);


        frame.repaint();

    }

    public static iEnumerator a(){
        while (Timer >= 5){
            Timer -= 1;
            yield return null;
        }
    }
}
