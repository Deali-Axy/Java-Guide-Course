package da.Experiment.Exp3;

import java.util.Scanner;

public class ExprAdditional {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一个整数（大于10000）：");
		long num = scanner.nextLong();
		System.out.print("超级水仙花数：");
		for (int i = 1; i <= num; i++) {
			if (isFlower(i))
				System.out.print(i + " ");
		}
	}

	private static boolean isFlower(int input) {
		String str = String.valueOf(input);
		int len = str.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int temp = Integer.valueOf(str.substring(i, i + 1));
			sum += Math.pow(temp, len);
		}

		return (sum == input);
	}
}
