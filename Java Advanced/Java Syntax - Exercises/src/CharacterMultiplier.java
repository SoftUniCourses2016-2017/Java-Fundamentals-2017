import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Magdalena on 21.1.2017 г..
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s");
        String str1;
        String str2;

        if (strings[0].length() > strings[1].length()) {
            str1 = strings[0];
            str2 = strings[1];
        } else {
            str1 = strings[1];
            str2 = strings[0];
        }
        long sumChars = calclulateSumChars(str1, str2);
        System.out.println(sumChars);
    }

    private static long calclulateSumChars(String str1, String str2) {
        long sumChars = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str2.length() > i){
                sumChars += str1.charAt(i) * str2.charAt(i);
            }
            else{
                sumChars += str1.charAt(i);
            }
        }
        return sumChars;
    }
}
