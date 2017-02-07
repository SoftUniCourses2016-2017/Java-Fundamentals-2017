import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by Magdalena on 1.2.2017 г..
 */
public class NestedFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\SoftUni\\Java Advanced 2017\\JavaResources\\Files-and-Streams";
        File root = new File(path);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(root);
        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            System.out.println(current.getName());
            count++;

            for (File dir : current.listFiles()) {
                if (dir.isDirectory()) {
                    dirs.offer(dir);
                }
            }
        }
        System.out.println(count + " folders");

    }
}
