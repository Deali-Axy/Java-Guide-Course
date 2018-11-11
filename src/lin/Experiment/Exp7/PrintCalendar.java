package lin.Experiment.Exp7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 提示用户输入一个年份(如2018)，输出该年的年历
 */
public class PrintCalendar {
    public static void main(String[] args) {
        String[] wd = {"日", "一", "二", "三", "四", "五", "六"};
        Scanner s = new Scanner(System.in);
        P("请输入要查询的年份：");
        int y = s.nextInt();
        P("请输入月份：");
        int m = s.nextInt();

        GregorianCalendar g = new GregorianCalendar(y, m - 1, 1);

        P("\n星期\t");
        for (int j = 0; j < wd.length; ++j)
            P(wd[j] + "\t");
        // 星期日到星期一的字
        P();
        for (int j = 0; j < g.get(Calendar.DAY_OF_WEEK); ++j)
            P("\t");

        // 补齐第一行的空格
        int thisMonth = g.get(Calendar.MONTH);
        // 获取月份
        for (int j = 1; j <= 31; ++j) {
            int d = g.get(Calendar.DAY_OF_MONTH);
            P(d + "\t");
            // 输出日期，例如某月的一号
            if (g.get(Calendar.DAY_OF_WEEK) == 7) {
                P("\n\t");
            }
            // 如果当前天为星期六则回车
            g.add(Calendar.DAY_OF_YEAR, 1);
            // 加一天
            if (g.get(Calendar.MONDAY) != thisMonth) {
                // 判断目前天数为几月
                P("\n\n");
                break;
            }
        }
    }

    private static void P(String s) {
        System.out.print(s);
    }

    private static void P() {
        System.out.println();
    }
}
