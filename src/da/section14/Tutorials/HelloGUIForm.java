package da.section14.Tutorials;

import javax.swing.*;

public class HelloGUIForm {
    private JButton btnMain;
    private JLabel labelMain;
    private JPanel panelMain;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloGUIForm");
        frame.setContentPane(new HelloGUIForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
