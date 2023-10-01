import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Enter a number:");
        int count = 0;
        int number;
        boolean start = true;
        for (number = write.nextInt(); count < number; count++) {
            if (start){
                System.out.println("The prime numbers in the range between 0 and "+number+" are:");
                start = false;
            }
            if (count != 1 && ( count == 2 | count % 2 != 0) && ( count == 3 | count % 3 != 0) && ( count == 5 | count % 5 != 0) && ( count == 7 | count % 7 != 0) && ( count == 11 | count % 11 != 0)) {
                System.out.print(count + " ");
            }
        }
        System.out.println("\nEnter a number to check:");
        int numberToCheck = write.nextInt();
        if ((numberToCheck != 1 && ( numberToCheck == 2 | numberToCheck % 2 != 0) && ( numberToCheck == 3 | numberToCheck % 3 != 0) && ( numberToCheck == 5 | numberToCheck % 5 != 0) && ( numberToCheck == 7 | numberToCheck % 7 != 0) && ( numberToCheck == 11 | numberToCheck % 11 != 0))){
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is NOT a prime number");
        }

    }
}
