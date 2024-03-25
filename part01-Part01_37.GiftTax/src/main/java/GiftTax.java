
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        double tax = 0;
        
        if ((giftValue >= 5000) && (giftValue <= 25000)){
            tax = 100;
            double taxRate = .08;
            int taxOverAmount = giftValue - 5000;
            tax += taxOverAmount * taxRate;
            System.out.println("Tax: " + tax);
        }
        else if ((giftValue >= 25000) && (giftValue <= 55000)){
            tax = 1700;
            double taxRate = .10;
            int taxOverAmount = giftValue - 25000;
            tax += taxOverAmount * taxRate;
            System.out.println("Tax: " + tax);
        }
        else if ((giftValue >= 55000) && (giftValue <= 200000)){
            tax = 4700;
            double taxRate = .12;
            int taxOverAmount = giftValue - 55000;
            tax += taxOverAmount * taxRate;
            System.out.println("Tax: " + tax);
        }
        else if ((giftValue >= 200000) && (giftValue <= 1000000)){
            tax = 22100;
            double taxRate = .15;
            int taxOverAmount = giftValue - 200000;
            tax += taxOverAmount * taxRate;
            System.out.println("Tax: " + tax);
        }
        else if ((giftValue >= 1000000)){
            tax = 142100;
            double taxRate = .17;
            int taxOverAmount = giftValue - 1000000;
            tax += taxOverAmount * taxRate;
            System.out.println("Tax: " + tax);
        }
        else{
            System.out.println("No tax!");
        }
    }
}
