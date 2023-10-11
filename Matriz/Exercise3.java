import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        String[][] matrix = {{"Bolo", "Pão", "Pão de queijo"}, {"Coxinha", "Café", "Risóles"}, {"Chá", "Queijo", "Mortadela"}};
        Scanner write = new Scanner(System.in);

        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        String search = write.next();
        String word = search.substring(0,1).toUpperCase() + search.substring(1);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (word.equals(matrix[i][j])){
                    System.out.println("Há "+word+" na padaria");
                }

            }
        }



    }
}
