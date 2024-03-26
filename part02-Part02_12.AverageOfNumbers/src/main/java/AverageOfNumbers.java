
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double total = 0;
        while(true){
        System.out.println("Give a number:");
        int currentNum = Integer.valueOf(scanner.nextLine());

        if (currentNum == 0){
            double average = total / count;
            System.out.println("Average of the numbers: " + average);
            break;
        }
        else {
            count++;
            total += currentNum;
        }
    }
    }
}
