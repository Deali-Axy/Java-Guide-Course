package da.Experiment.Exp4.Sub2;

public class Box {
	public double length;
	public double width;
	public double height;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(double l, double w, double h) {
		// TODO Auto-generated constructor stub
		this.length = l;
		this.width = w;
		this.height = h;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double volume() {
		return length * width * height;
	}
}
