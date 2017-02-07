import java.util.*;

/**
 * Created by Magdalena on 18.1.2017 г..
 */
public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.next());
        double b = Double.parseDouble(scanner.next());
        double c = Double.parseDouble(scanner.next());

        String bitwise = Integer.toBinaryString(a);
        Integer bitwiseInt = Integer.parseInt(bitwise);
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, Integer.parseInt(bitwise), b, c);
    }
}




