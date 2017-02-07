import java.util.Scanner;

/**
 * Created by Magdalena on 18.1.2017 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.next());
        double b = Double.parseDouble(scanner.next());

        double area = a * b;
        System.out.printf("%.2f", area);
    }
}
