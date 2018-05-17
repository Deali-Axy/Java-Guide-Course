package da.Experiment.Exp10.t3;

public class CastDemo1 {
    public static void main(String args[]) {
        Employee stuff;
        Manager boss = new Manager();
        stuff = boss;
        Manager myBoss;
        myBoss = (Manager) stuff;
        System.out.println(myBoss);
    }
}
