import java.util.Scanner;

public class ArraySplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenCount++] = number;
            } else {
                oddNumbers[oddCount++] = number;
            }
        }

        evenNumbers = java.util.Arrays.copyOf(evenNumbers, evenCount);
        oddNumbers = java.util.Arrays.copyOf(oddNumbers, oddCount);

        System.out.println("Even Numbers:");
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Odd Numbers:");
        for (int number : oddNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
