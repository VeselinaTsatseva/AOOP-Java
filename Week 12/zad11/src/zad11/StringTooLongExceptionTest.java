package zad11;

import java.util.Scanner;

public class StringTooLongExceptionTest {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        String textInput = "";

        while(!textInput.equals("DONE")){
            System.out.println("Enter text: ");
            textInput = input.nextLine();

            if (textInput.length() >= 20){
                try {
                    throw new StringTooLongException();
                } catch (StringTooLongException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
