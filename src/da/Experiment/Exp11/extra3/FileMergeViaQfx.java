package da.Experiment.Exp11.extra3;

import qfx.diagnostics.QDebug;
import qfx.io.QConsole;
import qfx.io.QDirectory;
import qfx.io.QPath;
import qfx.io.QStreamReader;
import qfx.io.QStreamWriter;
import qfx.util.QMath;

import java.io.*;
import java.util.ArrayList;

/**
 * Implement via QFramework.io<br>
 * 使用 <b>QFramework</b> 的IO库来实现文件读写<br>
 * 功能和 <b>FileMerge</b> 类一样<br>
 */
public class FileMergeViaQfx {
    public static void main(String args[]) {
        QConsole console = new QConsole(System.in, System.out);
        QDebug qdb = new QDebug();

        String path = "E:\\file";//我的电脑没有D盘
        String fileBaseName = QPath.join(path, "201611444120");
        String objectFileName = QPath.join(path, "201611444120.txt");

        QDirectory.create(path);

        ArrayList<File> files = new ArrayList<>();
        files.add(new File(fileBaseName + "A.txt"));
        files.add(new File(fileBaseName + "B.txt"));
        files.add(new File(fileBaseName + "C.txt"));

        // Write to files
        for (File f : files) {
            try {
                QStreamWriter sw = new QStreamWriter(f.getAbsolutePath());
                sw.writeLine(generateRndInteger());
                sw.writeLine(generateRndInteger());
                sw.close();
            } catch (IOException e) {
                qdb.error(e.getMessage());
            } catch (Exception e) {
                qdb.fatal(e.getMessage());
            }
        }

        //Read from files and merge files
        ArrayList<String> lines = new ArrayList<>();
        for (File f : files) {
            try {
                QStreamReader sr = new QStreamReader(f.getAbsolutePath());
                String line;
                while ((line = sr.readLine()) != null) {
                    lines.add(line);
                }
            } catch (Exception e) {
                qdb.fatal(e.getMessage());
            }
        }
        try {
            QStreamWriter sw = new QStreamWriter(objectFileName);
            for (String line : lines) {
                sw.writeLine(line);
            }
            sw.close();
        } catch (IOException e) {
            qdb.error(e.getMessage());
        } catch (Exception e) {
            qdb.fatal(e.getMessage());
        }
    }

    private static String generateRndInteger() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(QMath.random(0, 9));
        }
        return sb.toString();
    }
}
