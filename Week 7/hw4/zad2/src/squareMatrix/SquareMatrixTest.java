package squareMatrix;

import java.util.Random;

public class SquareMatrixTest {
    public static void main(String[] args) {

        Random randomN = new Random();
        int n = randomN.nextInt(11) + 1;
        Random randomElements = new Random();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for ( int j = 0; j < n; j++) {
                arr[i][j] = randomElements.nextInt(9);
            }
        }

        SquareMatrix matrix = new SquareMatrix(arr);

        System.out.print(matrix.toString());

        System.out.printf("Maximum sum: %d\n", matrix.findMaxSum());

        System.out.printf("Submatrices with Maximum sum: ");
        matrix.printAll();
    }
}
