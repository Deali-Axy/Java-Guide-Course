package da.Experiment.Exp10.t4;

import qfx.io.QConsole;

public class EdibaleTest {
    public static void main(String args[]) {
        QConsole console = new QConsole(System.in, System.out);

        Object[] obj = {new Beef(), new Mutton(), new Apple(), new Orange()};
        for (int i = 0; i < obj.length; i++) {
            console.writeLine(((Edible) (obj[i])).howToEat());
        }
    }
}
