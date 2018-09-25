package da.Experiment.Exp3;

public class ExprThree {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibonacci = new int[21];
		fibonacci[1] = 1;
		fibonacci[2] = 1;
		System.out.print("1 1 ");
		for (int i = 3; i <= 20; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			System.out.print(fibonacci[i] + " ");
		}

	}

}
