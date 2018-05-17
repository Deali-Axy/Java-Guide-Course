package da.Experiment.Exp9.t1;


public class Cylinder extends Circle {
	private double height;

	public Cylinder(double r, double h) {
		// TODO Auto-generated constructor stub
		super(r);
		height = h;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return super.getRadius();
	}

	public double getHeight() {
		return height;
	}

	public double getVol() {
		return super.getArea() * height;
	}

	public double getArea() {
		return super.getPerimeter() * height + super.getArea() * 2;
	}

	public void disp() {
		System.out.println("vol=" + getVol());
		System.out.println("area=" + getArea());
	}
}
