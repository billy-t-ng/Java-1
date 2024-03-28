
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int factorial = Integer.valueOf(scanner.nextLine());
        int start = 1;
        int result = 1;

        while(start <= factorial){
            result *= start;
            start++;
        }

        System.out.println("Factorial: " + result);
    }
}
