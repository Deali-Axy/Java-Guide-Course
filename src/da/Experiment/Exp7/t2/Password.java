package da.Experiment.Exp7.t2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter your password: ");
        valid(scanner.nextLine());
    }

    public static boolean valid(String pwd) {
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
