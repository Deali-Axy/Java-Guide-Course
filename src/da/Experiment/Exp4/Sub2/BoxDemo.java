package da.Experiment.Exp4.Sub2;

public class BoxDemo {
	public static void main(String[] args) {
		Box myBox = new Box();
		
		myBox.height = 1;
		myBox.length = 2.5;
		myBox.width = 3.2;
		
		System.out.println(myBox.height * myBox.length * myBox.width);

		Box myBox2 = new Box();
		
		myBox2.setLength(1);
		myBox2.setHeight(2.5);
		myBox2.setWidth(3);
		
		System.out.println(myBox2.volume());

		Box myBox3 = new Box(10, 20, 15);
		System.out.println(myBox3.volume());
	}
}
