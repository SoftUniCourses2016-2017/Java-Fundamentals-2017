import java.util.List;
import java.util.Scanner;

/**
 * Created by Magdalena on 21.1.2017 г..
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum = 0;
        int sub = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (nums[i] + nums[j] == target) {
                    sum = nums[i] + nums[j];
                    System.out.println(nums[i] + " + " + nums[j] + " = " + sum);
                } else if (nums[i] - nums[j] == target) {
                    sub = nums[i] - nums[j];
                    System.out.println(nums[i] + " - " + nums[j] + " = " + sub);
                }
            }
        }
    }
}
