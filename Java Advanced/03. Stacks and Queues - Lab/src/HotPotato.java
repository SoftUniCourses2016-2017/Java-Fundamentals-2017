import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> deque = new ArrayDeque<>();

        Collections.addAll(deque, children);
        while (deque.size() > 1){
            for (int i = 1; i < n; i++) {
                deque.offer(deque.poll());
            }

            System.out.println("Removed " + deque.poll());
        }
        System.out.println("Last is " + deque.poll());
    }
}
