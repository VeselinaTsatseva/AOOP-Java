package squareMatrix;

import java.util.Arrays;

public class SquareMatrix {

    private int[][] dataArray;

    public SquareMatrix(int[][] dataArray) {
        setDataArray(dataArray);
    }

    public SquareMatrix(){
        this(new int[][]{{0},{0}});
    }

    public SquareMatrix(SquareMatrix matrix){
        this(matrix.dataArray);
    }

    public int[][] getDataArray() {
        int[][] copy = new int[dataArray.length][dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray.length; j++) {
                copy[i][j] = dataArray[i][j];
            }
        }
        return copy;
    }

    public void setDataArray(int[][] dataArray) {
        if (dataArray != null){
            this.dataArray = new int[dataArray.length][dataArray.length];
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray.length; j++) {
                    this.dataArray[i][j] = dataArray[i][j];
                }
            }
        }else {
            this.dataArray = new int[][]{{0},{0}};
        }
    }


    public int findMaxSum(){
        int maxSum = 0;
        int[][] subMatrix = new int[2][2];

        if (subMatrix.length > dataArray.length) return 0;

        for (int i = 0; i < dataArray.length-1; i++) {
            for (int j = 0; j < dataArray.length-1; j++) {
                int sum = 0;
                for (int k = i; k < subMatrix.length+i; k++){
                    for (int l = j; l < subMatrix.length+j; l++) {
                        sum += dataArray[k][l];
                    }
                }
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public void printAll(){
        int maxSum = 0, row = 0, col = 0;
        int[][] subMatrix = new int[2][2];

        if (subMatrix.length > dataArray.length) return;

        for (int i = 0; i < dataArray.length-1; i++) {
            for (int j = 0; j < dataArray.length-1; j++) {
                int sum = 0;
                for (int k = i; k < subMatrix.length+i; k++){
                    for (int l = j; l < subMatrix.length+j; l++) {
                        sum += dataArray[k][l];
                    }
                }
                if (sum > maxSum){
                    maxSum = sum;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.printf("[%d, %d]", row, col);
    }

    @Override
    public String toString() {
        String stringMatrix = "";
        for (int i = 0; i < dataArray.length; i++) {
            for ( int j = 0; j < dataArray.length; j++) {
                  stringMatrix += dataArray[i][j] + " ";
            }
            stringMatrix += "\n";
        }
        return stringMatrix;
    }
}
