import java.io.*;
import java.util.Scanner;

/**
 * Created by Magdalena on 27.1.2017 г..
 */
public class ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\input.txt";
        String outputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\output.txt";
        try (Scanner scanner = new Scanner(new FileInputStream(inputPath));
             PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                    scanner.next();
                }
                scanner.next();
            }

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
