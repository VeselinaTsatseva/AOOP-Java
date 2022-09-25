package matrix;

public abstract class GenericMatrix<E extends Number> {
    protected abstract E add(E element1, E element2);
    protected abstract E multiply(E element1, E element2);
    protected abstract E zero();

    public E[][] addMatrix(E[][] matrix1, E[][] matrix2){
        if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length){
            throw new RuntimeException("The matrices must be same size!");
        }

        E[][] result = (E[][]) new Number[matrix1.length][];
        for (int i = 0; i < matrix1.length; i++) {
            result[i] = (E[]) new Number[matrix1[i].length];
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        }
        return result;
    }

    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2){
        if (matrix1.length != matrix2[0].length){
            throw new RuntimeException("The matrices must have compatible size!");
        }

        E[][] result = (E[][]) new Number[matrix1.length][matrix1.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][k] = add(result[i][k], multiply(matrix1[i][j], matrix2[j][k]));
                }
            }
        }
        return result;
    }
    public void printResult(E[][] m1, E[][] m2, E[][] m3, char op){
        int maxRows = Math.max(m1.length, Math.max(m2.length, m3.length));
        for (int i = 0; i < maxRows; i++) {
            printRow(m1, i);
            printOperator(op, i, maxRows);
            printRow(m2, i);
            printOperator('=', i, maxRows);
            printRow(m3, i);
        }
    }
    public void printRow(E[][] matrix, int currentRowIndex){
        if (currentRowIndex >= matrix.length){
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(" ");
            }
        } else {
            for (int i = 0; i < matrix[currentRowIndex].length; i++) {
                System.out.printf("%s ", matrix[currentRowIndex][i]);
            }
        }
    }
    public void printOperator(char op, int currentRowIndex, int maxRows){
        if (currentRowIndex == maxRows /2){
            System.out.printf("%c", op);
        } else{
            System.out.println(" ");
        }
    }
}
