package da.Experiment.Exp3;

public class ExprFour {

	/**
	 * Perfect Number
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {
			if (test(i))
				System.out.println("完全数:" + i);
		}
	}

	public static boolean test(int input) {
		int sum = 1;
		for (int i = 2; i < input / 2; i++) {
			if (input % i == 0)
				sum += i;
		}

		return sum == input;
	}
}
