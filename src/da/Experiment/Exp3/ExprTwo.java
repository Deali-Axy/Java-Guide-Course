package da.Experiment.Exp3;

import java.util.Scanner;

public class ExprTwo {

	/**
	 * Body mass index
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入体重（单位：kg）:");
		double weight = scanner.nextDouble();
		System.out.print("请输入身高（单位：米）:");
		double height = scanner.nextDouble();
		double bmi = weight / (height * height);

		String result = "";
		if (bmi < 16)
			result = "严重过轻";
		else if (bmi >= 16 && bmi < 18)
			result = "过轻";
		else if (bmi >= 18 && bmi < 24)
			result = "体重适中";
		else if (bmi >= 24 && bmi < 29)
			result = "过重";
		else if (bmi > 29 && bmi < 35)
			result = "非常肥胖";

		System.out.println("测试结果：" + result);
	}
}
