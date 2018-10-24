package lin.Experiment.Exp5;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 密码强度判断
 * 从键盘上输入一字符串作为密码，根据下列情况来判断密码是否有效，对有效的密码判断其强度。
 * 密码要求:长度至少6位，只能包含英文大小字母、数字以及特殊字符!@#$%^&。
 * 规则为：
 * （1）长度小于6位的密码为无效,对长度大于等于6的，但里面只含有一个字符的也无效，如aaaaaaaa。
 * 对于有效的密码，按下面规则判定其强度：
 * （2）对于（数字、小写字母、大写字母、含特殊字符），若密码中只含其中一种，此种密码强度为弱。如：
 * 1234567, abcdefs, ABDFGHJ, #$%@#$,
 * （3）对于（数字、小写字母、大写字母、特殊字符），若密码中只含其中两种，强度为中。
 * （4）对于（数字、小写字母、大写字母、特殊字符），若密码中只含其中三种，强度为强。
 * （5）对于（数字、小写字母、大写字母、特殊字符），若密码中这四种都包含，若密码长度大于12则强度为最强，否则为强。
 */
public class T1 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your password: ");
        valid_password(scanner.nextLine());
    }

    private static boolean valid_password(String pwd) {
        if (pwd.length() < 6) {
            System.out.println("Invalid! At least contain 6 chars!");
            return false;
        }

        if (Pattern.matches(String.format("[%c]{%d}", pwd.charAt(0), pwd.length()), pwd)) {
            System.out.printf("Invalid! only one char:%c\n", pwd.charAt(0));
            return false;
        }

        if (Pattern.matches(".*[^0-9a-zA-Z#$%&!@].*", pwd)) {
            System.out.println("Invalid!");
            return false;
        }

        boolean a = Pattern.matches(".*[0-9]+.*", pwd);// number
        boolean b = Pattern.matches(".*[a-z]+.*", pwd);// lower
        boolean c = Pattern.matches(".*[A-Z]+.*", pwd);// upper
        boolean d = Pattern.matches(".*[#$%&!@]+.*", pwd);// symbol

        if (a && b && c && d) {
            System.out.println("Strong password.");
        } else if (Pattern.matches("\\d+", pwd)) {
            System.out.println("Weak password");
        } else if (Pattern.matches("[a-z]+", pwd)) {
            System.out.println("Weak password");
        } else if (Pattern.matches("[A-Z]+", pwd)) {
            System.out.println("Weak password");
        } else if (Pattern.matches("[#$%&!@]+", pwd)) {
            System.out.println("Weak password");
        } else {
            System.out.println("Middle password");
        }
        return true;
    }
}
