package da.Experiment.Exp12.t1;

import qfx.io.QConsole;
import qfx.util.QDateTime;
import qfx.util.QMath;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DataStream {
    private static QConsole console = new QConsole(System.in, System.out);

    public static void main(String args[]) throws Exception {
//        Write();
        DataInputStream in = new DataInputStream(new FileInputStream("out.dat"));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(in.readInt());
        }
        Collections.sort(list);
        for (int i : list) {
            console.writeLine(i);
        }
    }

    public static void Write() throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("out.dat"));
        for (int i = 0; i < 100; i++) {
            int temp = QMath.random(1000, 2000);
            out.writeInt(temp);
            console.writeLine(temp);
        }
        out.close();
    }
}
