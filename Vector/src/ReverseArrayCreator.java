import java.util.Random;

public class ReverseArrayCreator {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;

        int[] originalArray = new int[size];
        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(100);
        }

        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = originalArray[size - 1 - i];
        }

        System.out.print("Original Array: ");
        for (int number : originalArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Reversed Array: ");
        for (int number : reversedArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
