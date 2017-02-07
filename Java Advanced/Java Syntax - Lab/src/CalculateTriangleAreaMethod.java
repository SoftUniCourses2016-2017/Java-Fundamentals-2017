import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Magdalena on 18.1.2017 г..
 */
public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = Double.parseDouble(scanner.next());
        double height = Double.parseDouble(scanner.next());

        double area = (base * height) / 2;
        System.out.print("Area = ");
        System.out.printf("%.2f", area);

    }
}
