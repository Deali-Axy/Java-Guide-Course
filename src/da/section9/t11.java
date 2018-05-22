package da.section9;

import java.io.*;

/**
 * Implement by java.io.Console
 */
public class t11 {
    public static void main(String args[]) throws Exception {
        String fileName;
        Console console = null;
        try {
            console = System.console();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
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
