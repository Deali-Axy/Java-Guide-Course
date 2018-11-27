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
        console.writeLine("enter file path: ");
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
                for (char c : line.trim().toCharArray()) {
                    if (c >= 'A' && c <= 'z')
                        alphaCount++;
                }
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            console.writeLine("Error! File not fount. \nMsg: %s\n", e.getMessage());
        } catch (IOException e) {
            console.writeLine("Error! Msg: %s\n", e.getMessage());
        }

        console.writeLine("Lines Count: %d\n", linesCount);
        console.writeLine("All Chars Count: %d\n", charsCount);
        console.writeLine("Aplha Count: %d\n", alphaCount);
    }
}
