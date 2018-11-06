package da.Experiment.Exp12.t3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterReader {
    private static final String FileName = "Exp12.t3.txt";

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a integer:");
        int inputInt = scanner.nextInt();
        System.out.print("Please enter a float:");
        float inputFloat = scanner.nextFloat();
        System.out.print("Please enter a string:");
        String inputStr = scanner.next();

        PrintWriter writer = new PrintWriter(FileName);
        writer.println(inputInt);
        writer.println(inputFloat);
        writer.println(inputStr);
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(FileName));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
