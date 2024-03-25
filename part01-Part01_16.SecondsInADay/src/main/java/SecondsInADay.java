
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int secsInDay = seconds * minutes * hours;

        System.out.println("How many days would you like to convert to seconds?");
        int daysToConvert = Integer.valueOf(scanner.nextLine());

        System.out.println(secsInDay*daysToConvert);


    }
}
