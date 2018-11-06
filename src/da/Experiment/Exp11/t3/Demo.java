package da.Experiment.Exp11.t3;

public class Demo {
    public static void main(String args[]) {
        try {
            throw new MyException("my exception");
        } catch (MyException e) {
            e.printMsg();
        }
    }
}
