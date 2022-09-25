package zad5;

import java.util.Arrays;

public class GenericMaxElementTest {
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(max) > 0){
                    max = list[i][j]; }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[][] integerMatrix = new Integer[][]{
                {1, 2, 3, 4, 5},
                {50, 12, 3, 42, 2}
        };
        System.out.println("Matrix: ");
        for (Integer[] row : integerMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.printf("Max element: %d\n", max(integerMatrix));
        System.out.println();
        String[][] textMatrix = new String[][]{
                {"a", "b", "c", "d"},
                {"da", "a", "d", "e"}
        };
        System.out.println("Matrix: ");
        for (String[] row : textMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.printf("Max element: %s\n", max(textMatrix));
    }
}
