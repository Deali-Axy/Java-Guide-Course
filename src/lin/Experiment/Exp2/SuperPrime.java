package lin.Experiment.Exp2;

import java.util.Scanner;

public class SuperPrime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number:");
        int inputNum = scanner.nextInt();
        for (int i = 1; i <= inputNum; i++) {
            if (isSuperPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isSuperPrime(int number) {
        if (isNotPrime(number))
            return false;

        String strNum = String.valueOf(number);
        for (int i = 1; i < strNum.length(); i++) {
            String tempStr = strNum.substring(0, strNum.length() - i);
            int tempNum = Integer.valueOf(tempStr);
            if (isNotPrime(tempNum))
                return false;
        }
        return true;
    }

    private static boolean isNotPrime(int number) {
        if (number == 2)
            return false;                        // 2特殊处理 2也是质数
        if (number < 2 || number % 2 == 0)
            return true;                       // 识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)                // 识别被奇数整除
                return true;
        }
        return false;
    }
}
