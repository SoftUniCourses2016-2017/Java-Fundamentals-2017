import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> deque = new ArrayDeque<>();
        Collections.addAll(deque, children);
        int counter = 1;
        while(deque.size() > 1){
            for (int i = 1; i < n; i++) {
                String firstChild = deque.poll();
                deque.offer(firstChild);

            }
            if (isPrime(counter)){
                System.out.println("Prime " + deque.peek());
            }
            else{
                System.out.println("Removed " + deque.poll());
            }
            counter++;

        }
        System.out.println("Last is " + deque.poll());
    }

    private static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }
        else{
            for (int divider = 2; divider <= Math.sqrt(number); divider++) {
                if (number % divider == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
