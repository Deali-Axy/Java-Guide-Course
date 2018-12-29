package lin.Experiment.Exp14.T2;

public class Msg {
    public String action = "";
    public int value = 0;

    public Msg() {
    }

    public Msg(String action) {
        this.action = action;
    }

    public Msg(String action, int value) {
        this.action = action;
        this.value = value;
    }
}
