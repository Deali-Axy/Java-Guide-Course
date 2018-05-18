package da.Experiment.Exp11.t2;

import java.io.IOException;

public class Demo {
    static void methodA() throws Exception {
        throw new IOException("error");
    }

    static void methodB() throws Exception {
        methodA();
    }

    static void main(String args[]) throws Exception {
        methodB();
    }
}
