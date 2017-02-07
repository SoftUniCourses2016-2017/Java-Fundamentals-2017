import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Magdalena on 26.1.2017 г..
 */
public class ReadFile {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\Java Advanced 2017\\Projects\\ReadFile.txt";
        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

