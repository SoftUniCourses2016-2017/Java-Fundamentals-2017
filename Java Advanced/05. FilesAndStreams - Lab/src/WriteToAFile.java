import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.*;

/**
 * Created by Magdalena on 26.1.2017 г..
 */
public class WriteToAFile {
    public static void main(String[] args) {
        String inputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\input.txt";
        String outputPath = "D:\\SoftUni\\Java Advanced 2017\\Projects\\output.txt";
        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try(
                InputStream in = new FileInputStream(inputPath);
                OutputStream out = new FileOutputStream(outputPath))
        {
            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {

                if (!symbols.contains((char) oneByte)){
                    out.write(oneByte);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
