
import java.util.Scanner;

public class Squared {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int squared = input *= input;
        System.out.println(squared);

    }
}
