import java.util.Scanner;

/**
 * Created by Magdalena on 6.2.2017 г..
 */
public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String upcase = "<upcase>";
        String upcaseClose = "</upcase>";

        while (input.contains(upcase)){
            int indexStart = input.indexOf(upcase);
            int indexStop = input.indexOf(upcaseClose);

            String reminder =  input.substring(indexStart + upcase.length(), indexStop);
            input = input.replace(upcase + reminder + upcaseClose, reminder.toUpperCase());

        }
        System.out.println(input);
    }
}
