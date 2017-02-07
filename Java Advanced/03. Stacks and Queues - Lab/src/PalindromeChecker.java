import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palindromeCandidate = scanner.nextLine();
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (Character ch : palindromeCandidate.toCharArray())
             {
                deque.offer(ch);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1){
            char first = deque.poll();
            char last = deque.pollLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
