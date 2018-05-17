package da.Experiment.Exp3;

import java.util.Scanner;

public class ExprFive {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.print("素数因子：");
        for (int i = 2; i < num / 2; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;// 2特殊处理
        if (num < 2 || num % 2 == 0)
            return false;// 识别小于2的数和偶数
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {// 识别被奇数整除
                return false;
            }
        }
        return true;
    }
}
