
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int end = Integer.valueOf(scanner.nextLine());
        while (count <= end) {
            System.out.println(count);
            count++;
        }
    }
}
