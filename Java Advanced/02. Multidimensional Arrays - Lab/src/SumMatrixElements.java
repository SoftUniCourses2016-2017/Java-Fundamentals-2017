import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Magdalena on 17.1.2017 г..
 */
public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String[] input = scanner.nextLine().split( ", ");

        int[][] numbers = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int row = 0; row < numbers.length; row++){
            String[] reminder = scanner.nextLine().split(", ");
            for (int col = 0; col < numbers[row].length; col++){

                numbers[row][col] = Integer.parseInt(reminder[col]);
            }
        }

        System.out.println(numbers.length);
        System.out.println(numbers[0].length);

        int sum = 0;
        for (int[] number : numbers){
            for(int i : number){
                sum += i;
            }

        }
        System.out.println(sum);
            }
        }

