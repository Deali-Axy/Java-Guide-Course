package lin.Experiment.Exp6.T2;

/**
 * 有一个抽象类CompareObject,其中定义一个抽象方法abstract int compareTo(Object  obj)用于比较两个对象。
 * 然后设计一个类Posisition从CompareObject类派生，该类有x和y两个成员变量表示坐标，
 * 该类实现compareTo()方法，用比较两个Posisition对象到原点（0，0）的距离之差。
 * 代码：
 */
public class Test {
    public static void main(String... args) {
        Posisition p1 = new Posisition(1, 2);
        Posisition p2 = new Posisition(4, 7);
        System.out.println(p1.compareTo(p2));
    }
}
