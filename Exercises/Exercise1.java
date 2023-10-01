import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);

        System.out.println("Enter a positive integer number: ");
        int number = write.nextInt();

        int count = 1;
        int result = 1;
        while (count < number+1) {
            result *= count;
            count +=1;
        }
        System.out.println("The fatorial of this number is "+result);

    }
}
