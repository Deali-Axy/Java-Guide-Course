package da.Experiment.Final.Exp1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComplexCalculator {
    private JTextField textField1;
    private JTextField textField2;
    private JButton addButton;
    private JButton minusButton;
    private JButton mulButton;
    private JButton divButton;
    private JTextArea textArea;
    private JPanel MainPanel;

    private Complex c1 = new Complex();
    private Complex c2 = new Complex();

    public ComplexCalculator() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parseComplex();
                c1.complexAdd(c1, c2);
                textArea.append(c1.toString() + "\n");
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parseComplex();
                c1.complexMinus(c1, c2);
                textArea.append(c1.toString() + "\n");
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parseComplex();
                c1.complexMul(c1, c2);
                textArea.append(c1.toString() + "\n");
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parseComplex();
                c1.complexDiv(c1, c2);
                textArea.append(c1.toString() + "\n");
            }
        });
    }

    private void parseComplex() {
        if (textField1.getText().length() > 0) {
            String raw = textField1.getText();
            raw = raw.replace("i", "");
            String[] r_i = raw.split("\\+");
            c1.setRealPart(Integer.valueOf(r_i[0]));
            c1.setImaginaryPart(Double.valueOf(r_i[1]));
        }

        if (textField2.getText().length() > 0) {
            String raw = textField2.getText();
            raw = raw.replace("i", "");
            String[] r_i = raw.split("\\+");
            c2.setRealPart(Integer.valueOf(r_i[0]));
            c2.setImaginaryPart(Double.valueOf(r_i[1]));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ComplexCalculator");
        frame.setContentPane(new ComplexCalculator().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
