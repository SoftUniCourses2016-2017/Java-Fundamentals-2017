import java.io.*;

/**
 * Created by Magdalena on 1.2.2017 г..
 */
public class CountCharactersType {
    private final static String inputPath = "/src/resources/inputProblem4.txt";
    private final static String outputPath = "/src/resources/outputProblem4.txt";

    public static void main(String[] args) throws FileNotFoundException {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + inputPath;
        String outputFilePath = projectPath + outputPath;
        File taskFile = new File(filePath);
        FileReader fileReader = new FileReader(taskFile);

        try (BufferedReader reader = new BufferedReader(fileReader);
             PrintWriter writer = new PrintWriter(outputFilePath)) {
            String line;
            int counterVowels = 0;
            int counterCons = 0;
            int counterPunctuation = 0;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c !=' '){
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            counterVowels++;
                        } else if(c == '!' || c == ',' || c == '.' || c == '?' || c=='-'){
                            counterPunctuation++;
                        }
                        else{
                            counterCons++;
                        }
                    }

                }
                writer.println("Vowels: " + counterVowels);
                writer.println("Consonants: " + counterCons);
                writer.println("Punctuation: " + counterPunctuation);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

