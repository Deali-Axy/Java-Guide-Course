package da.Experiment.Exp8.t1;


public class Rectangle {
	private double length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
		this(0, 0);
	}

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double perimeter() {
		return (width + length) * 2;
	}

	public double area() {
		return width * length;
	}
}
