package da.Experiment.Exp11.extra3;

import qfx.diagnostics.QDebug;
import qfx.io.QConsole;
import qfx.io.QPath;
import qfx.util.QMath;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FileMerge {
    public static void main(String args[]) {
        QConsole console = new QConsole(System.in, System.out);
        QDebug qdb = new QDebug();

        String path = "E:\\file";//我的电脑没有D盘
        String fileBaseName = QPath.join(path, "201611444120");
        String objectFileNmae = QPath.join(path, "201611444120.txt");

        Path p = Paths.get(path);
        if (Files.notExists(p)) {
            try {
                Files.createDirectory(p);
            } catch (Exception e) {
                qdb.error(e.getMessage());
            }
        }

        ArrayList<File> files = new ArrayList<>();
        files.add(new File(fileBaseName + "A.txt"));
        files.add(new File(fileBaseName + "B.txt"));
        files.add(new File(fileBaseName + "C.txt"));

        // Write to files
        for (File f : files) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(generateRndInteger());
                bw.newLine();
                bw.write(generateRndInteger());
                bw.flush();
                bw.close();
            } catch (IOException e) {
                qdb.error(e.getMessage());
            }
        }

        //Read from files and merge files
        ArrayList<String> lines = new ArrayList<>();
        for (File f : files) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
                br.close();
            } catch (IOException e) {
                qdb.error(e.getMessage());
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(objectFileNmae));
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            qdb.error(e.getMessage());
        }
    }

    public static String generateRndInteger() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(QMath.random(0, 9));
        }
        return sb.toString();
    }
}
