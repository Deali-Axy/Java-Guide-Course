package da.Experiment.Exp4.sub1;

public class Rectangle {
	private double length = 0;
	private double width = 0;

	public Rectangle() {
		// TODO Auto-generated constructor stub
		this(2, 1);
	}

	public Rectangle(double l, double w) {
		// TODO Auto-generated constructor stub
		length = l;
		width = w;
	}

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

	public double perimeter() {
		return (length + width) * 2;
	}

	public double area() {
		return length * width;
	}
}
