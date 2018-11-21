package lin.Experiment.Exp8;

import qfx.io.QPath;
import qfx.io.QStreamReader;
import qfx.io.QStreamWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 现有如下格式的成绩单（文本文件）score.txt:
 * 姓名:张三，数学72分，物理67分，英语80分.
 * 姓名:张四，数学82分，物理68分，英语90分.
 * 姓名:张五，数学92分，物理69分，英语91分.
 * 姓名:张六，数学62分，物理61分，英语81分.
 * <p>
 * 编写一程序，将上面的文本内容处理后按如下格式输出，并将输出的内容写入一个新的文件newscore.txt。
 * 排名规则：先总分，若总分相同，英语高的排在前，若英语分也相同，数学高的排在前，若数学也相同，物理高的排在前，若物理分也相同，按姓名来排。
 * 姓名:张五，数学92分，物理69分，英语91分. 总分：252名次：1
 * 姓名:张四，数学82分，物理68分，英语90分. 总分：240名次：2
 * 姓名:张三，数学72分，物理67分，英语80分. 总分：219名次：3
 * 姓名:张六，数学62分，物理61分，英语81分. 总分：204名次：4
 */
public class ScoreSort {
    public static void main(String... args) {
        ArrayList<Student> students = new ArrayList<>();

        String path = QPath.join(System.getProperty("user.dir"), "src", "lin", "Experiment", "Exp8", "score.txt");

        System.out.println(path);
        String pattern = "姓名:(\\S{2})，数学(\\d{2})分，物理(\\d{2})分，英语(\\d{2})分.";
        try {
            FileInputStream fs = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            String line;
            while ((line = br.readLine()) != null) {
                Pattern r = Pattern.compile(pattern);
                Matcher matcher = r.matcher(line);

                if (matcher.find()) {
                    Student student = new Student(matcher.group(1),
                            Integer.valueOf(matcher.group(2)),
                            Integer.valueOf(matcher.group(3)),
                            Integer.valueOf(matcher.group(4)));
                    students.add(student);
                } else
                    System.out.println("没有找到匹配项目！");
            }
            br.close();
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (SecurityException e) {
            System.out.println("没有读取权限！");
        } catch (IOException e) {
            System.out.println("IO错误！");
        }

        // 排序
        // 排名规则：先总分，若总分相同，英语高的排在前，若英语分也相同，数学高的排在前，若数学也相同，物理高的排在前，若物理分也相同，按姓名来排。
        students.sort((stu1, stu2) -> {
            int sum1 = stu1.english + stu1.physics + stu1.math;
            int sum2 = stu2.english + stu2.physics + stu2.math;
            if (sum1 == sum2)
                if (stu1.english == stu2.english)
                    if (stu1.math == stu2.math)
                        if (stu1.physics == stu2.physics)
                            return Character.compare(stu2.name.toCharArray()[0], stu1.name.toCharArray()[0]);
                        else
                            return Integer.compare(stu2.physics, stu2.physics);
                    else
                        return Integer.compare(stu2.math, stu1.math);
                else
                    return Integer.compare(stu2.english, stu1.english);
            else
                return Integer.compare(sum2, sum1);
        });

        // 输出文字和写入文件
        String outputPath = QPath.join(System.getProperty("user.dir"), "src", "lin", "Experiment", "Exp8", "newscore.txt");
        QStreamWriter writer = new QStreamWriter(outputPath);
        int rank = 1;
        for (Student stu : students) {
            String output = String.format("姓名:%s，数学%d分，物理%d分，英语%d分. 总分：%d 名次：%d",
                    stu.name, stu.math, stu.physics, stu.english, stu.sum(), rank++);
            try {
                writer.writeLine(output);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(output);
        }
        writer.close();
    }
}
