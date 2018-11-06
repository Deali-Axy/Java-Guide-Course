package lin.Experiment.Exp3;

/**
 * 定义一个名为Complex的类实现复数概念及运算，它的UML图如下，
 * 先实现该类的相关方法，再试编写主方法来测试该类这些的方法。
 */
public class Complex {
    private double a;
    private double b;

    public Complex() {
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Complex add(Complex c) {
        Complex result = new Complex(this.getA(), this.getB());
        result.setA(result.getA() + c.getA());
        result.setB(result.getB() + c.getB());
        return result;
    }

    public Complex subtract(Complex c) {
        Complex result = new Complex(this.getA(), this.getB());
        result.setA(result.getA() - c.getA());
        result.setB(result.getB() - c.getB());
        return result;
    }

    public Complex multiply(Complex complex) {
        Complex result = new Complex(this.getA(), this.getB());
        double a = result.getA();
        double b = result.getB();
        double c = complex.getA();
        double d = complex.getB();
        result.setA(a * c - b * d);
        result.setB(b * c + a * d);
        return result;
    }

    public Complex divide(Complex complex) {
        Complex result = new Complex(this.getA(), this.getB());
        double a = result.getA();
        double b = result.getB();
        double c = complex.getA();
        double d = complex.getB();
        result.setA((a * c + b * d) / (c * c + d * d));
        result.setB((b * c - a * d) / (c * c + d * d));
        return result;
    }

    public double abs() {
        return Math.sqrt(this.a * this.a + this.b * this.b);
    }

    @Override
    public String toString() {
        return String.format("%f+%fi", this.getA(), this.getB());
    }
}
