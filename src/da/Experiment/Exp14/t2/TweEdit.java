package da.Experiment.Exp14.t2;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TweEdit {
    private JTextField txtLeft;
    private JPanel panel1;
    private JTextField txtRight;

    public TweEdit() {
        txtLeft.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode()) {
                    case 10:
                        txtRight.setText(txtLeft.getText());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TweEdit");
        frame.setContentPane(new TweEdit().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
