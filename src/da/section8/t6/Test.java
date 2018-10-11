package da.section8.t6;

import qfx.io.QConsole;

public class Test {
    public static void main(String args[]) {
        QConsole qConsole = new QConsole(System.in, System.out);
        try {
            for (int i = 3; i >= 0; i--) {
                qConsole.writeLine("the value of i: %d", i);
                qConsole.writeLine("the result of 6 / %d = ", i, 6 / i);
            }
        } catch (ArithmeticException ae) {
            qConsole.writeLine("divided by zero");
        }
    }
}
