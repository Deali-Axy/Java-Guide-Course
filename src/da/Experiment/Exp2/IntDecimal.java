package da.Experiment.Exp2;

import java.util.Scanner;


public class IntDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个double数：");
        double a = input.nextDouble();
        System.out.println("整数部分：" + (int) a);
        System.out.println("小数部分：" + (a - (int) a));

    }
}
