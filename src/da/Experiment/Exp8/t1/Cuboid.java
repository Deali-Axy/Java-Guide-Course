package da.Experiment.Exp8.t1;

public class Cuboid extends Rectangle {
	private double heigth;

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public Cuboid() {
		// TODO Auto-generated constructor stub
	}

	public Cuboid(double l, double w, double h) {
		this.setLength(l);
		this.setWidth(w);
		this.setHeigth(h);
	}

	public double area() {
		return (super.area() + 
				this.getWidth() * this.getHeigth() + 
				this.getLength() * this.getHeigth()) * 2;
	}

	public double volume() {
		return this.getWidth() * this.getHeigth() * this.getLength();
	}
}
