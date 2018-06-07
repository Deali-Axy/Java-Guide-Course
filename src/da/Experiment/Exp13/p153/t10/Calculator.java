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
    private JLabel lblCurVal;
    private JLabel lblOp;

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

    public enumOperator operator = enumOperator.none;


    public Calculator() {
        this.txtResult.setEditable(false);
        this.lblCurVal.setText("");
        this.lblOp.setText("");

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(1);
                txtResult.setText(buffer.toString());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(2);
                txtResult.setText(buffer.toString());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(3);
                txtResult.setText(buffer.toString());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(4);
                txtResult.setText(buffer.toString());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(5);
                txtResult.setText(buffer.toString());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(6);
                txtResult.setText(buffer.toString());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(7);
                txtResult.setText(buffer.toString());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(8);
                txtResult.setText(buffer.toString());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(9);
                txtResult.setText(buffer.toString());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer.append(0);
                txtResult.setText(buffer.toString());
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //不能输入两个小数点
                if (!(buffer.indexOf(".") > -1))
                    buffer.append('.');
                txtResult.setText(buffer.toString());
            }
        });
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double bufferVal = Double.valueOf(buffer.toString());
                curValue = get_result(curValue, bufferVal, operator);
                buffer = new StringBuilder();
                buffer.append(curValue);
                txtResult.setText(buffer.toString());
                lblCurVal.setText("");
                lblOp.setText("");
                operator = enumOperator.none;
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buffer = new StringBuilder();
                curValue = 0;
                operator = enumOperator.none;
                lblOp.setText("");
                lblCurVal.setText("");
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
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operator != enumOperator.none)
                    buttonCalculate.doClick();
                curValue = Double.valueOf(buffer.toString());
                operator = enumOperator.add;
                lblOp.setText("+");
                lblCurVal.setText(buffer.toString());
                txtResult.setText("");
                buffer = new StringBuilder();
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operator != enumOperator.none)
                    buttonCalculate.doClick();
                curValue = Double.valueOf(buffer.toString());
                operator = enumOperator.sub;
                lblOp.setText("-");
                lblCurVal.setText(buffer.toString());
                txtResult.setText("");
                buffer = new StringBuilder();
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operator != enumOperator.none)
                    buttonCalculate.doClick();
                curValue = Double.valueOf(buffer.toString());
                operator = enumOperator.multiply;
                lblOp.setText("×");
                lblCurVal.setText(buffer.toString());
                txtResult.setText("");
                buffer = new StringBuilder();
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operator != enumOperator.none)
                    buttonCalculate.doClick();
                curValue = Double.valueOf(buffer.toString());
                operator = enumOperator.divide;
                lblOp.setText("÷");
                lblCurVal.setText(buffer.toString());
                txtResult.setText("");
                buffer = new StringBuilder();
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
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
