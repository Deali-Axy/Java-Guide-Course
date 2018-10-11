package da.Experiment.Exp4.sub1;

public class RectDemo {
	public static void main(String[] args) {
		Rectangle rt = new Rectangle();
		rt.setLength(1);
		rt.setWidth(2);

		System.out.println("Perimeter:" + rt.perimeter());
		System.out.println("Square:" + rt.area());
	}
}
