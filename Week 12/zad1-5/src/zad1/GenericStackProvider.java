package zad1;

import java.util.Arrays;

public class GenericStackProvider {

    private class GenericStack<E> {

        private int topIndex = 0;     // следи колко елемента има в масива досега
        private E[] array = (E[]) new Object[10];

        public int getSize() {
            return topIndex;
        }

        public E peek() {
            if(isEmpty()){
                return null;
            }
            return array[getSize() - 1];
        }

        public void push(E o) {
            if (topIndex == array.length){
                expandArray();
            }
            array[topIndex++] = o;
        }

        public E pop() {
            if (isEmpty()){
                return null;
            }
            E o = peek();
            array[topIndex--] = null;
            return o;
        }

        public boolean isEmpty() {
            return topIndex == 0;
        }

        private void expandArray(){
            E[] newArray = (E[]) new Object[getSize() * 2]; // създаваме масив с двойна дължина от предишния
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        @Override
        public String toString() {
            return "stack: " + Arrays.toString(array);
        }
    }

    // връща инстанция на Generic Stack
    public <E> GenericStack<E> getGenericStack(){
        return new GenericStack<>();
    }

    public static void main(String[] args) {
        GenericStackProvider genericStackProvider = new GenericStackProvider();
        GenericStack<Integer> integerStack = genericStackProvider.getGenericStack();

        for (int i = 0; i < 11; i++) {
            integerStack.push(i);
            System.out.printf("Pushed: %d\n", i);
        }

        System.out.println();

        int size = integerStack.getSize();
        System.out.printf("Size: %d\n", size);

        for (int i = 0; i < size; i++) {
            System.out.printf("Popped: %d\n", integerStack.pop());
        }

        System.out.println();

        GenericStack<String> textStack = genericStackProvider.getGenericStack();
        String[] texts = {"Have", "a", "nice", "weekend"};
        for (int i = 0; i < texts.length; i++) {
            textStack.push(texts[i]);
            System.out.printf("Pushed: %s\n", texts[i]);
        }

        System.out.println();

        size = textStack.getSize();
        System.out.printf("Size: %d\n", size);

        for (int i = 0; i < size; i++) {
            System.out.printf("Popped: %s\n", textStack.pop());
        }
    }
}
