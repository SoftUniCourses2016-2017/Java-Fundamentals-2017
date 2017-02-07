import java.io.*;

/**
 * Created by Magdalena on 2.2.2017 г..
 */
public class MergeTwoFiles {
    private static final String PROJECT_PATH = System.getProperty("user.dir") + "/src/resources/";
    private static final String ONE_FILE_PATH = PROJECT_PATH + "fileOneProblem7.txt";
    private static final String TWO_FILE_PATH = PROJECT_PATH + "fileTwoProblem7.txt";
    private static final String RESULT_FILE_PATH = PROJECT_PATH + "resultProblem7.txt";

    public static void main(String[] args)  {
        try (BufferedReader fileOneReader = new BufferedReader(new FileReader(ONE_FILE_PATH));
             BufferedReader fileTwoReader = new BufferedReader(new FileReader(TWO_FILE_PATH));
             PrintWriter writer = new PrintWriter(new FileWriter(RESULT_FILE_PATH, true))) {

            String line = "";
            while ((line = fileOneReader.readLine()) != null) {
               writer.println(line);
            }
            while ((line = fileTwoReader.readLine()) != null){
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
