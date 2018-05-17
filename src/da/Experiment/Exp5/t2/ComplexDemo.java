package da.Experiment.Exp5.t2;

public class ComplexDemo {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.setRealPart(2);
		c1.setImaginaryPart(4);
		c2.setRealPart(6);
		c2.setImaginaryPart(10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());

		Complex.complexAdd(c1, c2);
		Complex.complexDiv(c1, c2);
		Complex.complexMinus(c1, c2);
		Complex.complexMul(c1, c2);
	}
}
