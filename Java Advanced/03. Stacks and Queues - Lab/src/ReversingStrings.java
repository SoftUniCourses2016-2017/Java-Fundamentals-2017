import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class ReversingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (Character ch : inputString.toCharArray()) {
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
