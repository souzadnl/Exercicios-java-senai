import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random generator = new Random();
        Scanner write = new Scanner(System.in);

        System.out.println("Random matrix:");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int number = generator.nextInt(10);
                matrix[i][j] = number;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int determinant = (matrix[0][0] * matrix[0][0] - matrix[0][1] * matrix[0][1] + matrix[0][2] * matrix[0][2] - matrix[0][3] * matrix[0][3]);
        System.out.println("The determinate of this matrix is: "+determinant);

    }
}
