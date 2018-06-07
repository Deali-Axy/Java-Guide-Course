package da.Experiment.Exp11.t2;

import java.io.IOException;

public class Demo {
    public static void main(String args[]) throws Exception {
        methodB();
    }

    private static void methodA() throws Exception {
        throw new IOException("error");
    }

    private static void methodB() throws Exception {
        methodA();
    }
}
