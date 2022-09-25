package zad2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class GenericStackAsArrayListTest {

    private static class GenericStack<E> extends ArrayList<E> {
        // вместо променлива arraylist вътрешния клас extend-ва arraylist

        public int getSize() {
            return size();
        }

        public E peek() {
            return get(getSize() - 1);
        }

        public void push(E o) {
            add(o);
        }

        public E pop() {
            E o = get(getSize() - 1);
            remove(getSize() - 1);
            return o;
        }

        public boolean isEmpty() {
            return super.isEmpty();
        }

        @Override
        public String toString() {
            return "stack: " + super.toString();
        }
    }

    public static void main(String[] args) {
        GenericStack<String> textStack = new GenericStack<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter Text(%d/%d): ", i+1, 5);
            textStack.push(input.nextLine());
        }

        System.out.println("\nReverse order: ");

        int size = textStack.getSize();
        for (int i = 0; i < size; i++) {
            System.out.println(textStack.pop());
        }
    }
}
