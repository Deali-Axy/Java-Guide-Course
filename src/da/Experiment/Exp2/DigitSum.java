package da.Experiment.Exp2;

import java.util.Scanner;


public class DigitSum {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("输入一个三位整数：");
		int a = input.nextInt();
		int a1 = a / 100;
		int a2 = a % 100 / 10;
		int a3 = a % 10;
		System.out.printf("a1=%d,a2=%d,a3=%d", a1,a2,a3);
		System.out.println("三个数字之和："+(a1+a2+a3));
	}
}
