package da.Exercises.section14.Tutorials.GUIForm;

import qfx.util.QDateTime;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUIForm {
    private JButton btnMain;
    private JLabel labelMain;
    private JPanel panelMain;

    public HelloGUIForm() {

        btnMain.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Hello GUI Form", "title", JOptionPane.YES_NO_OPTION);
            }
        });

        Timer showTime = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelMain.setText(QDateTime.now().toShortTimeString());
            }
        });
        showTime.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloGUIForm");
        frame.setContentPane(new HelloGUIForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
