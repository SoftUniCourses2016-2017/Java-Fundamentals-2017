import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
/**
 * Created by Magdalena on 17.1.2017 г..
 */
public class ReadSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        String[] names = new String[lenght];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

}
