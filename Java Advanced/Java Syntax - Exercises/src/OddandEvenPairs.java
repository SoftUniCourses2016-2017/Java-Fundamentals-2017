import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Magdalena on 20.1.2017 г..
 */
public class OddandEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            nums.add(Integer.parseInt(input[i]));
        }
        if (nums.size() % 2 != 0){
            System.out.println("invalid length");
        }

        for (int i = 0; i < nums.size(); i+=2) {
            if (nums.get(i) % 2 == 0 && nums.get(i + 1) % 2 == 0){
                System.out.printf("%1$d, %2$d -> both are even", nums.get(i),",", nums.get(i + 1));
                System.out.println();
            }
            else if(nums.get(i) % 2 != 0 && nums.get(i + 1) % 2 != 0){
                System.out.printf("%1$d, %2$d -> both are odd", nums.get(i),",", nums.get(i + 1));
                System.out.println();
            }
            else{
                System.out.printf("%1$d, %2$d -> different", nums.get(i), ",", nums.get(i + 1));
            }

        }

    }
}
