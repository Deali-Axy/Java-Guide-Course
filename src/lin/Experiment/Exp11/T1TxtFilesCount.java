package lin.Experiment.Exp11;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;

/**
 * 自己选择一个目录，统计这个目录及其子目录下所有文本文件(.txt)的个数
 */
public class T1TxtFilesCount {
    public static void main(String... args) throws IOException {
        Path startingDir = Paths.get("/media/da/Storage/Code/java/1/school-java-course");
        List<Path> result = new LinkedList<Path>();
        Files.walkFileTree(startingDir, new FindJavaVisitor(result));
        System.out.println("该目录及其子目录下共有文本文件：" + result.size());
        for (Path child : result) {
            System.out.println(child.toString());
        }
    }

    private static class FindJavaVisitor extends SimpleFileVisitor<Path> {
        private List<Path> result;

        public FindJavaVisitor(List<Path> result) {
            this.result = result;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            if (file.toString().endsWith(".txt")) {
                result.add(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
