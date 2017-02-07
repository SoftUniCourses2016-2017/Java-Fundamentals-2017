import java.util.Scanner;

/**
 * Created by Magdalena on 6.2.2017 г..
 */
public class ParseURLs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] reminder = input.split("://");
        if (reminder.length != 2) {
            System.out.println("Invalid URL");
        } else {
            int index = reminder[1].indexOf("/");
            String server = reminder[1].substring(0, index);
            String resources = reminder[1].substring(index + 1);
            System.out.println(String.format("Protocol = %s", reminder[0]));
            System.out.println(String.format("Server = %s", server));
            System.out.println(String.format("Resources = %s", resources));
        }
    }
}
