package lin.Experiment.Exp4.t1;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 出队游戏：有n(n>=12)个人，其编号从1—n，并有一个随机数k(2<k<n)。
 * 游戏规则是这n个人围成一圈，从1号开始报数，报到k的人出队，
 * 然后又重新继续报数，打印出队顺序编号。(要求用数组，n和k从键盘读入)
 */
public class T1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.println("please enter n:");
            n = scanner.nextInt();
            if (n > 11)
                break;
            else
                System.out.println("n must bigger than 11");
        }
        int k = 0;
        while (true) {
            System.out.println("please enter k");
            k = scanner.nextInt();
            if (k > 2 && k < n)
                break;
            else
                System.out.println("error input! 2<k<" + n);
        }


        boolean playerList[] = new boolean[n];
        int count = 1;  //报数
        int left = n - 1;   //剩下多少人没有出列
        int index = 0;  //当前报数位置
        do {
            int turns = 0;
            while (turns < n) {
                turns++;
                // 到末尾了，从头开始报数
                if (++index == n)
                    index = 1;
                if (!playerList[index - 1]) {
                    count++;
                    if (count == k) {
                        System.out.println(index + "号出列");
                        playerList[index - 1] = true;
                        count = 1;
                        left--;
                        break;
                    }
                }
            }
            if (left == 0)
                break;
        } while (true);
    }
}
