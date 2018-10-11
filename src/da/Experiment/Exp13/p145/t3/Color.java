package da.Experiment.Exp13.p145.t3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Color {
    private JPanel panel1;
    private JButton btnRed;
    private JButton btnGreen;
    private JButton btnBlue;
    private JButton btnYellow;

    private static JFrame frame;

    public Color() {
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(java.awt.Color.RED);
            }
        });
        btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(java.awt.Color.GREEN);
            }
        });
        btnBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(java.awt.Color.BLUE);
            }
        });
        btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(java.awt.Color.YELLOW);
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("Color");
        frame.setContentPane(new Color().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
//        frame.pack();
        frame.setVisible(true);
    }
}
