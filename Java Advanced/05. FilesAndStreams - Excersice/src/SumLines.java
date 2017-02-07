import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Magdalena on 1.2.2017 г..
 */
public class SumLines {

    private final static String path = "/src/resources/inputProblem1.txt";

    public static void main(String[] args) throws FileNotFoundException {

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + path;

        File someFile = new File(filePath);

        FileReader fileReader = new FileReader(someFile);

        try (BufferedReader reader = new BufferedReader(new FileReader(someFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
