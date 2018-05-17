package da.Experiment.Exp9.t1;

public class Circularcone extends Cylinder {
	public Circularcone(double r, double h) {
		// TODO Auto-generated constructor stub
		super(r, h);
	}

	@SuppressWarnings("unused")
	private double getLength() {
		return Math.sqrt(getRadius() * getRadius() + getHeight() * getHeight());
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return super.getRadius();
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}

	@Override
	public double getVol() {
		// TODO Auto-generated method stub
		return super.getVol() / 3;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI * getRadius() * getLength() + PI * getRadius() * getRadius();
	}

	public void disp() {
		System.out.println("vol=" + getVol());
		System.out.println("area=" + getArea());
	}
}
