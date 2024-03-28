

public class FromOneToParameter {

    public static void printUntilNumber(int number){
        int count = 1;
        while (count <= number){
            System.out.println(count);
            count++;
        }

    }

    public static void main(String[] args) {

        printUntilNumber(5);
    }

}
