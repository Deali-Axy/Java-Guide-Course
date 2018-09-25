package da.Experiment.Exp9.t1;

public class Circle {
	public final double PI = 3.14159265358;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double r) {
		radius = r;	
	}

	public double getPerimeter() {
		return 2 * PI * radius;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public void disp() {
		System.out.println("radius=" + radius);
		System.out.println("perimeter=" + getPerimeter());
		System.out.println("area=" + getArea());
	}
}
