
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double total = 0;

        while (true){
            System.out.println("Give a number:");
            int currentNum = Integer.valueOf(scanner.nextLine());

            if(currentNum > 0){
                count++;
                total += currentNum;
            }

            else if((count == 0) && (currentNum == 0)){
                System.out.println("Cannot calculate the average");
                break;
            }
            else if (currentNum == 0){
                double average = total / count;
                System.out.println(average);
                break;
            }

        }

    }
}
