import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Magdalena on 1.2.2017 г..
 */
public class ListFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\SoftUni\\Java Advanced 2017\\JavaResources\\Files-and-Streams";
        Path output = Paths.get("D:\\SoftUni\\Java Advanced 2017\\JavaResources\\Files-and-Streams\\output.txt");

        File file = new File(path);

        List<String> lines = new ArrayList<>();

        if (file.isDirectory()){
            File[] files = file.listFiles();

            for (File file1 : files) {
                if (!file1.isDirectory()){
                    lines.add(String.format("%s: %s", file1.getName(), file1.length()));
                    System.out.printf("$s: %s%n", file1.getName(), file1.length());
            }
                
            }
        }
        try{
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
