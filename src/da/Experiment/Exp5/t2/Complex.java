package da.Experiment.Exp5.t2;

public class Complex {
	private double realPart;
	private double imaginaryPart;

	public Complex() {
		// TODO Auto-generated constructor stub
	}

	public Complex(double r, double i) {
		this.setRealPart(r);
		this.setImaginaryPart(i);
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

	public static void complexAdd(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.setRealPart(c1.getRealPart() + c2.getRealPart());
		c3.setImaginaryPart(c1.getImaginaryPart() + c2.getImaginaryPart());
		System.out.println(c3.toString());
	}

	public static void complexMinus(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		c3.setRealPart(c1.getRealPart() - c2.getRealPart());
		c3.setImaginaryPart(c1.getImaginaryPart() - c1.getImaginaryPart());
		System.out.println(c3.toString());
	}

	public static void complexMul(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		double a = c1.getRealPart();
		double b = c1.getImaginaryPart();
		double c = c2.getRealPart();
		double d = c2.getImaginaryPart();
		c3.setRealPart(a * c - b * d);
		c3.setImaginaryPart(b * c + a * d);
		System.out.println(c3.toString());
	}

	public static void complexDiv(Complex c1, Complex c2) {
		Complex c3 = new Complex();
		double a = c1.getRealPart();
		double b = c1.getImaginaryPart();
		double c = c2.getRealPart();
		double d = c2.getImaginaryPart();

		c3.setRealPart((a * c + b * d) / (c * c + d * d));
		c3.setImaginaryPart((b * c - a * d) / (c * c + d * d));
		
		System.out.println(c3.toString());
	}

	public static boolean complexEquels(Complex c1, Complex c2) {
		return c1.getRealPart() == c2.getRealPart()
				&& c1.getImaginaryPart() == c2.getImaginaryPart();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getRealPart() + " + " + getImaginaryPart() + "i";
	}
}
