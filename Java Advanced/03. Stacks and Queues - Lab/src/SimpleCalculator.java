import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Magdalena on 19.1.2017 г..
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, tokens);
        while(stack.size() > 1){
            int first = Integer.valueOf(stack.pop());
            String ch = stack.pop();
            int second = Integer.valueOf(stack.pop());

            if (ch.equals("+")){
                stack.push(String.valueOf(first + second));
            }
            else{
                stack.push(String.valueOf(first - second));
            }

        }
        System.out.println(stack.pop());
    }
}
