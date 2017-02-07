import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.next());
        double b = Double.parseDouble(scanner.next());
        double c = Double.parseDouble(scanner.next());

        double first = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / Math.sqrt(c));
        double second = Math.pow((a * a + b * b - c * c * c), (a - b));
        double third = ((first + second) / 2) - ((a + b + c) / 3);

        System.out.printf("F1 result: %.2f; ", first);
        System.out.printf("F2 result: %.2f; ", second);
        System.out.printf("Diff: %.2f", third);

    }
}
