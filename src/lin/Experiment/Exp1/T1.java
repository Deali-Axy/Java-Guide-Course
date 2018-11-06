package lin.Experiment.Exp1;

import java.util.Scanner;

/**
 * 编写一个应用程序，在屏幕上显示如下信息：
 * ***************************************
 *       Welcome  <your mane>
 * ***************************************
 */
public class T1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.next();
        System.out.println("***************************************");
        System.out.printf("Welcome %s\n", name);
        System.out.println("***************************************");
    }
}
