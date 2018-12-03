package da.Exercises.section8.t14;

import qfx.io.QConsole;

public class ExceptionTest {
    public static void main(String args[]) {
        QConsole qConsole = new QConsole(System.in, System.out);
        try {
            throw new Exception("error");
        } catch (Exception e) {
            qConsole.writeLine(e.getMessage());
        } finally {
            qConsole.writeLine("finally");
        }
    }
}
