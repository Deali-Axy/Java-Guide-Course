package da.Experiment.Final.Exp1;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {

    }

    public Complex(double r, double i) {
        this.realPart = r;
        this.imaginaryPart = i;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void complexAdd(Complex c1, Complex c2) {
        c1.realPart += c2.realPart;
        c1.imaginaryPart += c2.imaginaryPart;
    }

    public void complexMinus(Complex c1, Complex c2) {
        c1.realPart -= c2.realPart;
        c1.imaginaryPart -= c2.imaginaryPart;
    }

    public void complexMul(Complex c1, Complex c2) {
        c1.realPart *= c2.realPart;
        c1.imaginaryPart *= c2.imaginaryPart;
    }

    public void complexDiv(Complex c1, Complex c2) {
        c1.realPart /= c2.realPart;
        c1.imaginaryPart /= c2.imaginaryPart;
    }

    public static boolean complexEquels(Complex c1, Complex c2) {
        return c1.realPart == c2.realPart && c1.imaginaryPart == c2.imaginaryPart;
    }
    

    @Override
    public String toString() {
        return String.format("%f+%fi", realPart, imaginaryPart);
    }
}
