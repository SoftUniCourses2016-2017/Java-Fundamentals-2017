import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Magdalena on 22.1.2017 г..
 */
public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] participantsAndPoints = scanner.nextLine().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            String[] participants = new String[participantsAndPoints.length / 2];
            int[] points = new int[participantsAndPoints.length / 2];

            participants[i] = participantsAndPoints[i];
            points[i] = Integer.parseInt(participantsAndPoints[i + 1]);

            for (String participant :
                    participants) {
                System.out.println(participant);
            }
            for (int point :
                    points) {
                System.out.println(point);
            }


        }
    }
}
