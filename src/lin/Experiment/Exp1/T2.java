package lin.Experiment.Exp1;

import java.util.Scanner;

/**
 * 输入三角形三边a,b,c,令p为三边和的一半，
 * 根据公式 sqrt(p * (p - a) * (p - b) * (p - c)) 求三角形的面积，
 * 数据输入可Scanner类的nextFloat()方法读入。
 */
public class T2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入三角形的三条边(a,b,c)：");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("三角形面积为：%f", area);
    }
}
