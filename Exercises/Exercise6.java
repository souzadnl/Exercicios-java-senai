import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Enter a number:");
        int count = 0;
        int result = 0;
        int number;
        for (number = write.nextInt(); count < number; count++) {
            if (count % 2 == 0) {
                result = result + count;
            }
        }
        System.out.println("The sum of the even numbers in a range of 0 and "+number+" is "+result);
    }
}
