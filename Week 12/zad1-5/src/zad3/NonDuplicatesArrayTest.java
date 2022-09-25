package zad3;

import java.util.ArrayList;
import java.util.Arrays;

public class NonDuplicatesArrayTest {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> uniques = new ArrayList<>();
        for (E item : list){
            if (!uniques.contains(item)){
                uniques.add(item);
            }
        }
        return uniques;
    }

    public static void main(String[] args) {
        Integer[] numbersArray = new Integer[]{1,1,1,1,1,2,2,3,3};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.printf("Array List: %s\n", numbers);
        System.out.printf("Uniques: %s\n", removeDuplicates(numbers));

        ArrayList<String> texts = new ArrayList<>(Arrays.asList("a", "a", "a", "b", "b", "d"));
        System.out.printf("Array List: %s\n", texts);
        System.out.printf("Uniques: %s\n", removeDuplicates(texts));
    }
}
