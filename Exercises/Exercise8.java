import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Enter the base value");
        int baseNumber = write.nextInt();
        System.out.println("Enter the exponent value");
        int exponent = write.nextInt();
        long result = 1;
        for (int count = 0; count < exponent; count++){
            result *= baseNumber;
        }
        System.out.println("The result of operation "+baseNumber+" to the power of "+exponent+" is "+ result);

    }
}
