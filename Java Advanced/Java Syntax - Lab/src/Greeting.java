import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Magdalena on 16.1.2017 г..
 */
public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if (firstName.isEmpty()){
            firstName = "*****";
        }
        if (secondName.isEmpty()){
            secondName = "*****";
        }

        System.out.printf("Hello, " + firstName + " " + secondName + "!");
    }
}
