package da.Experiment.Exp2;

public class DataTypeDemo {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        boolean b = true;
        int x = 8, y = 8;
        float f = 4.5f;
        double d = 1.71828;
        char c;
        c = '\u0041';
        x = 12;
        System.out.println("b=" + b);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("f=" + f);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("PI=" + PI);
        System.out.println("-" + ((x < 8) ? 9.9 : 9));
    }
}
