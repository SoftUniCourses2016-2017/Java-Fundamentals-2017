import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Magdalena on 16.1.2017 г..
 */
public class TransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        String dayOrNight = scanner.next();

        double totalPrice = 0;

        if (km >= 20 && km < 100) {
            totalPrice = km * 0.09;
        } else if (km >= 100) {
            if (dayOrNight.equals("day") || dayOrNight.equals("night")) {
                totalPrice = km * 0.06;
            }
        } else if (km < 20){
            if (dayOrNight.equals("day")) {
                totalPrice = (km * 0.79) + 0.70;
            } else{
                totalPrice = (km * 0.90) + 0.70;
            }
        }
        System.out.printf("%.2f", totalPrice);


    }
}
