package da.Experiment.Exp13.p153.t10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton buttonAdd;
    private JButton buttonSub;
    private JButton buttonMultiply;
    private JButton buttonDot;
    private JButton a0Button;
    private JButton buttonCalculate;
    private JButton buttonDivide;
    private JTextField txtResult;
    private JPanel panelMain;
    private JButton buttonClear;
    private JButton buttonBack;

    /**
     * 操作符
     */
    enum enumOperator {
        none,
        add,
        sub,
        multiply,
        divide,
    }

    /**
     * 当前数值
     */
    private double curValue = 0;
    /**
     * 缓冲区数据
     */
    private StringBuilder buffer = new StringBuilder();
    /**
     * 结果数值
     */
    private double resValue = 0;

    public enumOperator operator = enumOperator.none;


    public Calculator() {
        this.txtResult.setEditable(false);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(1);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(2);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(3);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(4);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(5);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(6);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(7);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(8);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(9);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(0);
                curValue = Integer.valueOf(buffer.toString());
                txtResult.setText(buffer.toString());
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append('.');
                txtResult.setText(buffer.toString());
            }
        });
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer = new StringBuilder();
                curValue = 0;
                resValue = 0;
                txtResult.setText("");
            }
        });
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.deleteCharAt(buffer.length() - 1);
                txtResult.setText(buffer.toString());
            }
        });
    }

    private double get_result(double val1, double val2, enumOperator op) {
        switch (op) {
            case add:
                return val1 + val2;
            case sub:
                return val1 - val2;
            case multiply:
                return val1 * val2;
            case divide:
                return val1 / val2;
            case none:
                return val1;
            default:
                return val1;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
