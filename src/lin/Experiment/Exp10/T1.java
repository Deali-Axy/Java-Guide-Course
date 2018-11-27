package lin.Experiment.Exp10;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 有一客人的点菜单内容如下：
 * 榴莲披萨:189.0元
 * 炒猪肉:35.5元
 * 清炒沙虫:80.0元
 * 小青菜:10.5元
 * 编写一程序，输出菜单中的价格数据，并计算出总价格，格式如下：
 * 榴莲披萨:189.0元
 * 炒猪肉:35.5元
 * 清炒沙虫:80.0元
 * 小青菜:10.5元
 * 总价:315.0元。
 * 注：要捕获数据转换时的异常。
 */
public class T1 {
    public static void main(String... args) {
        ArrayList<String> strMenus = new ArrayList<>();
        ArrayList<MenuItem> menus = new ArrayList<>();
        strMenus.add("榴莲披萨:189.0元");
        strMenus.add("炒猪肉:35.5元");
        strMenus.add("清炒沙虫:80.0元");
        strMenus.add("小青菜:10.5元");

        try {
            Pattern pattern = Pattern.compile("(\\S+):(\\d+.\\d)元");
            for (String item : strMenus.toArray(new String[0])) {
                Matcher matcher = pattern.matcher(item);
                if (matcher.find()) {
                    menus.add(new MenuItem(matcher.group(1), Float.valueOf(matcher.group(2))));
                } else
                    System.out.println("mis match!");
            }
        } catch (NumberFormatException e) {
            System.out.println("数据转换异常！" + e.getMessage());
        }

        float sum = 0;
        for (MenuItem m : menus) {
            sum += m.price;
            System.out.printf("%s:%.1f元\n", m.name, m.price);
        }
        System.out.printf("总价:%.1f", sum);
    }

    private static class MenuItem {
        public String name = "";
        public float price = 0;

        public MenuItem(String name, float price) {
            this.name = name;
            this.price = price;
        }
    }
}
