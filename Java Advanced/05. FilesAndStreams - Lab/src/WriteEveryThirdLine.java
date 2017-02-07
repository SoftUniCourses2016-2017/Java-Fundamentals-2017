import java.io.*;
import java.util.Scanner;

/**
 * Created by Magdalena on 1.2.2017 г..
 */
public class WriteEveryThirdLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\input.txt";
        String outputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(outputPath)) {

            String line = reader.readLine();
            int counter = 1;

            while (line != null) {
                if (counter % 3 == 0) {
                    writer.println(line);
                }

                line = reader.readLine();
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
