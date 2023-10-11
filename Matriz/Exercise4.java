public class Exercise4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Normal matrix:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Transposed matrix:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
