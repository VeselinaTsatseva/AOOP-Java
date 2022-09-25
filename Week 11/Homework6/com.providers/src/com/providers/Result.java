package com.providers;

import java.util.Arrays;

public class Result {

    private char[] chars;
    private int data;

    public Result(char[] chars, int data) {
        setChars(chars);
        setData(data);
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars != null ? chars : null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data > 0 ? data : 0;
    }

    @Override
    public String toString() {
        return "Result {" + " chars = " + Arrays.toString(chars) + ", data = " + data + '}';
    }
}
