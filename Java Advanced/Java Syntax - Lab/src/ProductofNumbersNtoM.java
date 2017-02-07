import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Magdalena on 18.1.2017 г..
 */
public class ProductofNumbersNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int m = Integer.parseInt(scanner.next());

        BigInteger result = BigInteger.valueOf(1);

        for (int i = n; i <= m; i++) {

            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("product["+n +".."+m+"] = " + result);

    }
}
