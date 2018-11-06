package da.Experiment.Exp15;

import qfx.util.QMath;

import java.util.ArrayList;

/**
 * 编写程序，将5个Integer对象存放到ArrayList对象中，然后按正序和倒序访问其中的每个元素。
 */
public class t1 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(QMath.random(0, 99));
        }

        System.out.println("正序输出");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("倒序输出");
        for (int i = 4; i > -1; i--) {
            System.out.println(list.get(i));
        }
    }
}
