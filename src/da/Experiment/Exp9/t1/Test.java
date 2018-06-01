package da.Experiment.Exp9.t1;


public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle(4);
		circle.disp();

		Cylinder cylinder = new Cylinder(4, 6);
		cylinder.disp();

		Circularcone circularcone = new Circularcone(4, 6);
		circularcone.disp();
	}
}
