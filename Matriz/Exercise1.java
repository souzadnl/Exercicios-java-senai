public class Exercise1 {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixB = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        int[][] matrixC = new int[][];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i<3; i++){
            for (int j = 0; j<3;j++){
                int[][] matrixC = matrixA [i][j] + matrixB[i][j];
            }
        }
    }
}
