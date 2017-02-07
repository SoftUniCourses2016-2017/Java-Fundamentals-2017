import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

/**
 * Created by Magdalena on 26.1.2017 г..
 */
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String inputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\input.txt";
        String outputByte = "D:\\SoftUni\\Java Advanced 2017\\Projects\\output.txt";
        try (FileInputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputByte)) {

            int oneByte = 0;
            while ((oneByte = fis.read()) >= 0) {
                if (oneByte == 10 || oneByte == 32) {
                    out.write(oneByte);
                } else {
                    String decimal = String.valueOf(oneByte);
                    for (int i = 0; i < decimal.length(); i++) {
                        System.out.print(decimal.charAt(i));
                    }
                }


            }
        }
    }

}

