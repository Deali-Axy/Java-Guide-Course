package da.Experiment.Exp7.t1;

import java.util.Scanner;

public class StrEncrypt {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter a string: ");
		String input = scanner.next();
		System.out.println("Result: " + encrypt(input));
	}

	public static String encrypt(String input) {
		StringBuilder sb = new StringBuilder();

		for (char c : input.toCharArray()) {
			if ('z' - c >= 5)
				sb.append((char) (c + 5));
			else {
				sb.append((char)(5 - ('z' - c)+'a'-1));
			}
		}

		return sb.toString();
	}
}
