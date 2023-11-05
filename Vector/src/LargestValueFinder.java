import java.util.Random;

public class LargestValueFinder {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }

        int largestValue = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largestValue) {
                largestValue = numbers[i];
            }
        }

        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("The largest value is: " + largestValue);
    }
}
