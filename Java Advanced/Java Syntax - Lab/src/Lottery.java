import java.util.Scanner;

/**
 * Created by Magdalena on 16.1.2017 г..
 */
public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            for (int j = i + 1; j <= 9; j++) {
                for (int k = j + 1; k <= 10; k++) {
                    System.out.print(i + " " + j + " " + k);
                    System.out.println();
                }


            }

        }
    }
}
