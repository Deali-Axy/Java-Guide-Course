package lin.Experiment.Exp1;

import java.util.Scanner;

/**
 * 编写一个程序，读入用户输入的两个整数K1和K2（K2>K1），
 * 然后输出K1到K2之间所有的素数以及所有素数之和，输出时每行显示的个数自定.
 */
public class T3 {
    public static void main(String args[]) {
        System.out.println("Please enter two Integer K1,K2");
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        if (k2 <= k1) {
            System.out.println("K2 must bigger than K1!");
            return;
        }
        int count = 0;
        for (int i = k1; i < k2; i++) {
            if (isPrime(i)) {
                System.out.println("Found prime number: " + i);
                count += i;
            }
        }
        System.out.printf("All prime between %d and %d sum is %d", k1, k2, count);
    }


    private static boolean isPrime(int number) {
        if (number == 2)
            return true;                        // 2特殊处理 2也是质数
        if (number < 2 || number % 2 == 0)
            return false;                       // 识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)                // 识别被奇数整除
                return false;
        }
        return true;
    }
}
