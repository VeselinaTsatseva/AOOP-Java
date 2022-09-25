package zad11;

public class StringTooLongException extends Exception{

    public StringTooLongException() {
        super("The string is too long!");
    }
}
