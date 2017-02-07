import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class FromDecimalToBaseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> result = new ArrayList<>();
        int reminder = 0;
        boolean finish = false;
        while(!finish){
            if (number == 0) {
                finish = true;
            }
            else {
                reminder = number % 7;
                number = number / 7;
                result.add(reminder);
            }
            reminder = 0;
        }
        for (int i = result.size()-1; i >=0 ; i--) {
            int a = result.get(i);
            System.out.print(a);
        }
        System.out.println();
    }
}


