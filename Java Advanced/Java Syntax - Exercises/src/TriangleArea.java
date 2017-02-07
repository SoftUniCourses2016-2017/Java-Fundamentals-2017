import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * Created by Magdalena on 18.1.2017 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aX = Integer.parseInt(scanner.next());
        int aY = Integer.parseInt(scanner.next());
        int bX = Integer.parseInt(scanner.next());
        int bY = Integer.parseInt(scanner.next());
        int cX = Integer.parseInt(scanner.next());
        int cY = Integer.parseInt(scanner.next());

        int area = Math.abs((aX* (bY - cY) + bX*(cY - aY) + cX*(aY - bY))/ 2);
        if (area == 0){
            System.out.println("0");
        }
        else{
            System.out.println(area);
        }



    }
}
