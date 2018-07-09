package da.Experiment.Exp15;

import qfx.util.QMath;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 掌握集合元素的访问方法。
 */
public class t2 {
    private static HashSet<Integer> hashSet = new HashSet<>();
    private static TreeSet<Integer> treeSet = new TreeSet<>();

    public static void main(String args[]) {
        sub_t1();
        sub_t2();
        sub_t3();
    }

    /**
     * （1）编写程序，随机生成20个一位数，将它们分别添加到HashSet对象和TreeSet对象中。
     */
    private static void sub_t1() {
        for (int i = 0; i < 20; i++) {
            hashSet.add(QMath.random(0, 9));
            treeSet.add(QMath.random(0, 9));
        }
    }

    /**
     * （2）使用增强的for循环访问集合中的每个元素。
     */
    private static void sub_t2() {
        for (Integer i : hashSet) {
            System.out.println(i);
        }

        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }


    /**
     * （3）使用Iterator迭代器访问集合中的每个元素。为什么集合中的元素不是20个?
     */
    private static void sub_t3() {
        Iterator it1 = hashSet.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
