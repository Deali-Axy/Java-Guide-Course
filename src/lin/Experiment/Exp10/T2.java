package lin.Experiment.Exp10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 编写一个求N!+1000/b[x] 的Java程序（其中N！=1*2*3…*N，规定0!=1,
 * 另外 数组b中的每个元素由(int)(Math.random()*5)算出，N和x为用户从键盘输入，
 * 但当输入的
 * （1）N<0或N>32就产生结果溢出异常，并捕获（即自定义异常）
 * （2）捕获运行异常。
 */
public class T2 {
    public static void main(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter n:");
        int n = scanner.nextInt();
        System.out.println("please enter x:");
        int x = scanner.nextInt();
        if (n < 0 || n > 32)
            throw new NumberNOverflow();
        else {
            try {
                Integer[] b = generate(1000);
                System.out.println(factorial(n) + 1000 / b[x]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


    private static Integer[] generate(int x) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            integers.add((int) (Math.random() * 5));
        }
        return integers.toArray(new Integer[0]);
    }

    public static int factorial(int number) {
        int result = 1;
        if (number == 0)
            return result;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static class NumberNOverflow extends Exception {

    }
}
