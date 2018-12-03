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

/**
 * 编写一个文本文件合并程序，要求如下：
 * (1)在D盘根目录上新建一个file目录, 然后在该目录下建R（R是2-8中的一个随机整数）个文本文件（比如，若R=4，就建4个文件），文件名分别为你的学号+字母序号.txt,（假设学号是201611001，第一个文本文件就是201611001A.txt,第二个文件就是201611001B.txt，依次类推）。
 * 然后在第一个文件中随机写入40个整数（0-100中的数），每5个一行
 * 第二个文件中随机写入40个整数（0-100中的数），每5个一行
 * 第三个文件中随机写入40个整数（0-100中的数），每5个一行
 * 依次类推。
 * <p>
 * （2）再编写一个合并文件程序
 * 然后将D盘file目录下的这些文本文件合并成一个新的文本文件,文件名为你的学号.txt。
 * 合并规则
 * 先随机生成一个随机整数x(40-60之间的整数)，从第一个文件开始，将这些文件中大于x的数输出到新的文件中，且每10个数为一行。
 * 最后在屏幕上显示合并后文件的内容。
 * <p>
 * 文件合并实验。
 * 因为怕老师不知道我用的QFramework库，所以用Java原生再写了一次。
 */
public class FileMerge {
    public static void main(String args[]) {
        QConsole console = new QConsole(System.in, System.out);
        QDebug qdb = new QDebug();

        String path = "E:\\file";   //我的电脑没有D盘
        String fileBaseName = QPath.join(path, "201611444120");
        String objectFileName = QPath.join(path, "201611444120.txt");

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
            BufferedWriter bw = new BufferedWriter(new FileWriter(objectFileName));
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
