package lin.Experiment.Exp7;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 输入一个整型数n(n<100),计算98765432100123456789^n的结果
 */
public class BigIntegerPow {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:(n<100)");
        int n = scanner.nextInt();
        if (n >= 100) {
            System.out.println("n bigger than 100");
            return;
        }
        BigInteger result = new BigInteger("98765432100123456789");
        System.out.println(result.pow(n));
    }
}
