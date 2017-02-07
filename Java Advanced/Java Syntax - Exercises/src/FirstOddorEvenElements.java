import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by Magdalena on 22.1.2017 г..
 */
public class FirstOddorEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        String[] target = scanner.nextLine().split(" ");
     Integer targetNum = Integer.valueOf(target[1]);
int count = 0;

        for (int i = 0; i < nums.length; i++) {


            if (target[2].equals("even")) {
                if (Integer.valueOf(nums[i]) % 2 == 0) {
                    System.out.print(nums[i] + " ");
                    count++;
                    if (count == targetNum){
                        return;
                    }
                }
            } else {
                if (Integer.valueOf(nums[i]) % 2 != 0) {
                    System.out.print(nums[i] + " ");
                    count++;
                    if(count == targetNum){
                        return;
                    }
                }
            }
        }
    }


}

