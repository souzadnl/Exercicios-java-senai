import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int count = 0;
        boolean stopper = true;
        System.out.println("Enter a number to find out the multiplication table: ");
        for (int number = write.nextInt(); count <= 10; count++){
            if (stopper) {
                System.out.println("This is the "+number+" times table:");
                stopper = false;
            }
            System.out.println(count+" x "+number+" = "+(count*number));
        }
    }
}
