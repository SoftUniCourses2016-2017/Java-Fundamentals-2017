import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SortLines {
    public static void main(String[] args) {
        Path inputPath = Paths.get("D:\\SoftUni\\Java Advanced 2017\\Projects\\input.txt");
        Path outputPath = Paths.get("D:\\SoftUni\\Java Advanced 2017\\Projects\\input.txt");
        try {
            List<String> lines = Files.readAllLines(inputPath);
            Collections.sort(lines);

            Files.write(outputPath, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}