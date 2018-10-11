package da.Experiment.Exp5.t3;

public class PointDemo {
	public static void main(String[] args) {
		Point start = new Point();
		Point end = new Point();

		start.setX(10);
		start.setY(10);

		end.setX(20);
		end.setY(30);

		System.out.printf("start.x=%d, start.y=%d\n", start.getX(), start.getY());
		System.out.printf("end.x=%d, end.y=%d\n", end.getX(), end.getY());

		Point stary = end;
		System.out.printf("end.x=%d, end.y=%d\n", end.getX(), end.getY());
		System.out.printf("stary.x=%d, stary.y=%d\n", stary.getX(), stary.getY());

		stary.setX(1);
		stary.setY(2);
		System.out.printf("end.x=%d, end.y=%d\n", end.getX(), end.getY());
		System.out.printf("stary.x=%d, stary.y=%d\n", stary.getX(), stary.getY());
		
		start.setX(100);
		start.setY(100);
		System.out.printf("start.x=%d, start.y=%d\n", start.getX(), start.getY());
		System.out.printf("end.x=%d, end.y=%d\n", end.getX(), end.getY());
	}
}
