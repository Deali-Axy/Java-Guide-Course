package da.Experiment.Final.Exp2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class IntArrayGUI {
    private JTextField textFieldArray;
    private JTextField textFieldNumber;
    private JButton okButton;
    private JTextArea textArea1;
    private JPanel MainPanel;

    public IntArrayGUI() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int number = Integer.valueOf(textFieldNumber.getText());
                String[] intputArray = textFieldArray.getText().split(",");
                ArrayList<Integer> list = new ArrayList<>();
                for (String s : intputArray) {
                    list.add(Integer.valueOf(s));
                }
                IntArray intArray = new IntArray(list.toArray(new Integer[]{}));
                IntArray sortedArray = new IntArray(intArray.getSortedElem());
                textArea1.append("数组中的元素为：" + intArray.toString() + "\n");
                textArea1.append("数组中的最大元素为：" + intArray.getMaxElem() + "\n");
                textArea1.append("数组中的最小元素为：" + intArray.getMinElem() + "\n");
                textArea1.append("数组中所有元素的和为：" + intArray.getSumElem() + "\n");
                textArea1.append("数组中所有元素的平均值为：" + intArray.getAvgElem() + "\n");
                textArea1.append("从小到大返回数组的元素：" + sortedArray.toString() + "\n");
                textArea1.append("最大元素是否为质数：" + (intArray.isPrimeOfMaxElem() ? "是" : "否") + "\n");
                textArea1.append("数组：" + (intArray.isFindElem(number) ? "存在" : "不存在") + "给定的整数" + number + "\n");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IntArrayGUI");
        frame.setContentPane(new IntArrayGUI().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
