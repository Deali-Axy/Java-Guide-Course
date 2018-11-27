package lin.Experiment.Exp9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class WordsCount {
    private static JFrame frame;
    private JTextArea textArea1;
    private JButton actionButton;
    private JTextArea textArea2;
    private JPanel MainPanel;

    public WordsCount() {
//        JScrollPane jsp1 = new JScrollPane(textArea1);
//        JScrollPane jsp2 = new JScrollPane(textArea2);
//        jsp1.setBounds(20, 20, 100, 200);
//        jsp2.setBounds(20, 20, 100, 200);
//        Container c = frame.getContentPane();
//        c.add(jsp1);
//        c.add(jsp2);

        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = textArea1.getText();
                input = input.replace(",", " ")
                        .replace(".", " ")
                        .replace("?", "");
                String[] array = input.split(" ");

                Map<String, Integer> map = new TreeMap<>();

                for (String s : array) {
                    if (map.containsKey(s))
                        map.replace(s, map.get(s) + 1);
                    else
                        map.put(s, 1);
                }

                //将map.entrySet()转换成list
                List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
                //然后通过比较器来实现排序
                Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                    //升序排序
                    public int compare(Map.Entry<String, Integer> o1,
                                       Map.Entry<String, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                });


                textArea2.append("总共有" + array.length + "个单词，不同词数是" + map.size() + "\n");
                textArea2.append("出现的次数分别是：\n");

                for (Map.Entry<String, Integer> mapping : list) {
                    System.out.println(mapping.getKey() + ":" + mapping.getValue());
                    textArea2.append(mapping.getKey() + " " + mapping.getValue() + "\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        frame = new JFrame("WordsCount");
        frame.setContentPane(new WordsCount().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
