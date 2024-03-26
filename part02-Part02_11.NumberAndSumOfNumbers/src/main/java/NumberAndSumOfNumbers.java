
import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int total = 0;

        while (true){
            System.out.println("Give a number:");
            int currentNum =+ Integer.valueOf(scanner.nextLine());


            if(currentNum == 0){
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + total);
                break;
            }
            else {
                total += currentNum;
                count++;
    
            }
        }
    }
}
