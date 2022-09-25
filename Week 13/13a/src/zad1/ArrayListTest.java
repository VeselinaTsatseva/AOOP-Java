package zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

    public static <E extends Comparable<E>> E max (E[][] list){
        E maxElement = null;
        for (int i = 0; i < list.length; i++) {
            if(maxElement == null){ // ако няма такъв инициализираме
                maxElement = Collections.max(Arrays.asList(list[i]));
            } else {
                E newMaxElement = Collections.max(Arrays.asList(list[i]));
                if(newMaxElement.compareTo(maxElement) > 0){
                    maxElement = newMaxElement;
                }
            }
        }
        return maxElement;
    }

    public static <E> void shuffle(ArrayList<E> list){
        Collections.shuffle(list);
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        return Collections.max(list);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> uniques = new ArrayList<>();
        //int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) == 1){ // ако дад. елемент се среща веднъж
                uniques.add(list.get(i));
            } else {
                list.remove(i);
                i--;
            }
        }
        return uniques;
    }

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{
                {1,2,3,4},
                {3,6,2,53,5}
        };
        System.out.printf("Max element: %d\n", max(matrix));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.printf("List: %s\n", list);
        shuffle(list);
        System.out.printf("Shuffled list: %s\n", list);

        System.out.printf("Max element: %s\n", max(list));

        ArrayList<Integer> duplicates = new ArrayList<>(Arrays.asList(1,11,2,3,4,1,3,2,3,3,5));
        System.out.printf("Uniques: %s\n", removeDuplicates(duplicates));

    }
}
