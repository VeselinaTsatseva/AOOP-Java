package zad7a;

import java.util.Random;

public class Sequence {
    // Holds a sequence of Objects.
    private Object[] obs;
    private int next = 0;

    public Sequence(int size) {
        obs = new Object[size];
    }

    public void add(Object x) {
        if (next < obs.length) {
            obs[next] = x;
            next++;
        }
    }

    private class Sselector implements Selector {
        // inner class манипулира преместване от първия към последния
        int i = 0;

        public boolean end() {
            return i == obs.length;
        }

        public Object current() {
            return obs[i];
        }

        public void next() {
            if (i < obs.length) i++;
        }
    }

    private class RSelector implements Selector{
        // inner class манипулира преместване от последния към първия
        int i = obs.length - 1;
        @Override
        public boolean end() {
            return i < 0;
        }

        @Override
        public Object current() {
            return obs[i];
        }

        @Override
        public void next() {
            if(i >= 0){
                i--;
            }
        }
    }

    public Selector getSelector() {
        return new Sselector();
    }

    public Selector getRSelector(){
        return new RSelector();
    }

    public static void main(String[] args) {
        Random random = new Random();
        int size = 8;
// (1)създайте Sequence последователност от 8 елемента
        Sequence sequence = new Sequence(size);

// (2)инициализирайте Sequence елементите със случайни цели числа от интервала [10, 100]
        for (int i = 0; i < size; i++) {
            sequence.add(10 + random.nextInt(91));
        }

// (3)използвайте метода getSelector(),за да разпечатате тези числа на конзолата
// от първия до последния елемент на последователността
        Selector selector = sequence.getSelector();
        System.out.println("Forwards: ");
        while(!selector.end()){
            System.out.printf("%s ", selector.current());
            selector.next();
        }
        System.out.println();

// (4)използвайте метода getRSelector(),за да разпечатате на конзолата тези числа
// от последния елемент до първия на последователността
        selector = sequence.getRSelector();
        System.out.println("Backwards: ");
        while(!selector.end()){
            System.out.printf("%s ", selector.current());
            selector.next();
        }
    }
}
