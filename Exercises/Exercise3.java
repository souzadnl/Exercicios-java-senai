import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        String PASSWORD = "@Mange";
        System.out.println("Enter the password: ");

        while (true) {
            String user = write.nextLine();

            if (user.equals(PASSWORD)) {
                System.out.println("Correct password. Access allowed!\nWelcome");
                break;
            } else {
                System.out.println("Incorrect password, try again.");
            }
        }
    }
}
