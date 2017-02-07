import java.util.Scanner;

/**
 * Created by Magdalena on 17.1.2017 г..
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heigh = Integer.parseInt(scanner.nextLine());

        long[][] pascal = new long[heigh][];
        for (int i = 0; i < heigh; i++){
            pascal[i] = new long[i + 1];
        }
        for (int row = 0; row < heigh; row++){

            pascal[row][0] = 1;
            pascal[row][pascal[row].length - 1] = 1;
            for (int col = 1; col < pascal[row].length - 1; col++) {
                pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col];
            }
        }
        for (long[] ints : pascal){
            for (long aInt : ints) {
                System.out.print(aInt + " ");
            }
            System.out.println();
        }
    }
}
