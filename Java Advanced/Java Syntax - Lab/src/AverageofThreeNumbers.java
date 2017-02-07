import java.util.Scanner;

/**
 * Created by Magdalena on 16.1.2017 г..
 */
public class AverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();

        double avg = (first + second + third) / 3;
        System.out.printf("%.2f", avg);
    }
}
