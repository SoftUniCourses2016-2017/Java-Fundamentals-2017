import java.util.Scanner;

/**
 * Created by Magdalena on 24.1.2017 г..
 */
public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehicle = scanner.nextLine().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String customer = scanner.nextLine().toLowerCase();

        while (!customer.equals("End of customers!")) {

            String[] customerSplit = customer.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            String car = customerSplit[0];
            int seats = Integer.parseInt(customerSplit[1]);

            for (int i = 0; i < vehicle.length; i++) {

            }
        }

    }
}
