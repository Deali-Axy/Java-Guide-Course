package da.Experiment.Exp14.t5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormWithMenu extends JFrame implements ActionListener {
    private JMenuItem itemExit;
    private JButton btnExit;

    public FormWithMenu() {
        this.setTitle("Form With Menu");

        JMenuBar jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);

        JMenu menuFile = new JMenu("文件(F)");
        menuFile.setMnemonic('F');
        jMenuBar.add(menuFile);
        menuFile.add(itemExit = new JMenuItem("退出"));
        itemExit.addActionListener(this::actionPerformed);

        btnExit = new JButton("退出");
        btnExit.setSize(60, 30);
        btnExit.setFont(new Font(Font.MONOSPACED, 1, 20));
        btnExit.addActionListener(this);

        Panel panelBottom = new Panel();
        panelBottom.add(btnExit);

        this.add(new Panel(), BorderLayout.CENTER);
        this.add(panelBottom, BorderLayout.PAGE_END);

        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new FormWithMenu();
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object src = actionEvent.getSource();
        if (src == itemExit || src == btnExit)
            System.exit(0);
    }
}
