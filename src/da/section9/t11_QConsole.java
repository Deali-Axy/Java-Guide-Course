package da.section9;

import qfx.io.QConsole;

import java.io.*;

/**
 * implement by qfx.io.QConsole
 */
public class t11_QConsole {
    public static void main(String args[]) throws Exception {
        String fileName;
        QConsole console = new QConsole(System.in, System.out);
        console.printf("enter file path: ");
        fileName = console.readLine();

        int linesCount = 0;
        long charsCount = 0;
        long alphaCount = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                linesCount++;
                charsCount += line.length();
                for (char c : line.toCharArray()) {
                    if (c >= 'A' && c <= 'z')
                        charsCount++;
                }
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            console.printf("Error! File not fount. \nMsg: %s\n", e.getMessage());
        } catch (IOException e) {
            console.printf("Error! Msg: %s\n", e.getMessage());
        }

        console.printf("Lines Count: %d\n", linesCount);
        console.printf("All Chars Count: %d\n", charsCount);
        console.printf("Aplha Count: %d\n", alphaCount);
    }
}
