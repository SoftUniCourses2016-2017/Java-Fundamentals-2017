import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Magdalena on 16.1.2017 г..
 */
public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantity = scanner.nextDouble();

        double pricePerOne = 1.20;
        BigDecimal pricePerLevas = new BigDecimal(pricePerOne * quantity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal total = exchangeRate.multiply(pricePerLevas);
        System.out.printf("%.2f marks", total);
    }
}
