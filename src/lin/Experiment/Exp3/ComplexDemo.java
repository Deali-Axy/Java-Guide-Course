package lin.Experiment.Exp3;

public class ComplexDemo {
    public static void main(String args[]) {
        Complex c1 = new Complex(2, 6);
        Complex c2 = new Complex(5, 8);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.add(c2).toString());
        System.out.println(c1.subtract(c2).toString());
        System.out.println(c1.multiply(c2).toString());
        System.out.println(c1.divide(c2).toString());
        System.out.println(c1.abs());
        System.out.println(c2.abs());
    }
}
