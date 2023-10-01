import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        Random random = new Random();

        int cpu = random.nextInt(1, 100);
        System.out.println("The machine drew a number, try to guess!");

        while (true){
            int user = write.nextInt();

            if (user == cpu){
                System.out.println("You're right!! The number drawn is "+cpu);
                break;
            } else {
                if (user < cpu){
                    System.out.println("The number you entered is LESS than the number drawn, try again");
                } else {
                    System.out.println("The number you entered is BIGGER than the number drawn, try again");
                }
            }
        }
    }
}
