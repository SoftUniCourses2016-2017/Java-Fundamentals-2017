import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Magdalena on 6.2.2017 г..
 */
public class SpecialWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] specialWords = scanner.nextLine().split(" ");
        String[] text = scanner.nextLine().split(" ");

        HashMap<String, Integer> result = new HashMap<>();
        for (String specialWord : specialWords) {
            result.put(specialWord, 0);
        }
        for (String specialWord : specialWords) {
            for (String word : text) {
                if (specialWord.compareToIgnoreCase(word) == 0) {
                    if (result.containsKey(specialWord)) {
                        result.put(specialWord, result.get(specialWord) + 1);
                    }
                    else{
                        result.put(specialWord, 1);
                    }
                }
            }
        }
        for (String s : result.keySet()) {
            System.out.println(s + " - " + result.get(s));
        }
    }
}
