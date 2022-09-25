package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

    private ArrayList<String> list;

    public ArrayListTest (){
        list = new ArrayList<>(Arrays.asList("Лили", "Мария", "Георги", "Илия", "Цвета", "Георги"));
    }

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<>(Arrays.asList("Лили", "Мария", "Георги", "Илия", "Цвета", "Георги"));
        ArrayList<String> bList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

        String bElement;
        String aElement;
        Iterator<String> aIterator = aList.iterator();
        Iterator<String> bIterator;

        while(aIterator.hasNext()){
            bIterator = bList.iterator();
            aElement = aIterator.next();
            while (bIterator.hasNext()){
                bElement = bIterator.next();
                if(aElement.equals(bElement)){
                    System.out.printf("Found common element: %s\n",aElement);
                    break;
                }
            }
        }

        ArrayListTest test = new ArrayListTest();
        ListIterator<String> nameIterator = test.list.listIterator();
        while (nameIterator.hasNext()) {
            if (nameIterator.next().equals("Георги")) {
                nameIterator.add("Симеон");
                break;
            }
        }
        System.out.printf("Result after e): %s\n", test.list);
    }
}
