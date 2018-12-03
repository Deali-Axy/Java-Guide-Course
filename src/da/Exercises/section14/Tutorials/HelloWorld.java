package da.Exercises.section14.Tutorials;

import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String args[]) {
        JFrame frame = new JFrame("HelloWorld");
        JLabel label = new JLabel("HelloWorld", SwingConstants.CENTER);
        label.setFont(new Font("Consolas", 1, 20));
        frame.setSize(300, 100);
        frame.add(label);
        frame.setLocationRelativeTo(null);  //put it on the center screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
