package com.providers;

import com.services.Cipherable;

import java.util.Random;

public class Wrapper {

    private int size;

    public Wrapper(int size) {
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size > 0 ? size : 0;
    }


    public Cipherable makeFixedSelection(){
        return new FixedRandom();
    }

    public Cipherable makeFixedRandom(){
        return new FixedSelection();
    }

    private class FixedRandom implements Cipherable{

        @Override
        public char[] getSecretChars(int seed) {
            Random random = new Random();
            char[] chars = new char[size];
            for (int i = 0; i < size; i++) {
                chars[i] = (char)(random.nextInt(seed) + 'A');
            }
            return chars;
        }
    }

    private class FixedSelection implements Cipherable{

        @Override
        public char[] getSecretChars(int seed) {
            Random random = new Random();
            char[] chars = new char[size];
            for (int i = 0; i < size; i++) {
                chars[i] = (char)(random.nextInt(seed) + 'A');
            }
            return chars;
        }
    }

}
