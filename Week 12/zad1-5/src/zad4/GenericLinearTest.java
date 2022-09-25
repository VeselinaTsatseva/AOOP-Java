package zad4;

public class GenericLinearTest {

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbersArray = new Integer[]{1,1,1,1,1,2,2,3,3};
        System.out.printf("Index for %d: %d\n", 1, linearSearch(numbersArray, 1));
        System.out.printf("Index for %d: %d\n", 2, linearSearch(numbersArray, 2));
        System.out.printf("Index for %d: %d\n", 3, linearSearch(numbersArray, 3));

        String[] textArray = new String[]{"a", "a", "a", "b", "b", "d"};
        System.out.printf("Index for %s: %d\n", "a", linearSearch(textArray, "a"));
        System.out.printf("Index for %s: %d\n", "b", linearSearch(textArray, "b"));
        System.out.printf("Index for %s: %d\n", "d", linearSearch(textArray, "d"));
    }
}
