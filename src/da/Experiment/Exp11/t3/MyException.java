package da.Experiment.Exp11.t3;

import qfx.io.QConsole;

public class MyException extends Exception {
    private QConsole console = new QConsole(System.in, System.out);
    private String msg;

    public MyException(String msg) {
        this.msg = msg;
    }

    public void printMsg() {
        console.writeLine(this.msg);
    }
}
