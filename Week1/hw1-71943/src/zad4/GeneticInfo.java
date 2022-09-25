package zad4;

import java.util.Scanner;

public class GeneticInfo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        String userInput = input.nextLine();
        int number = Integer.parseInt(userInput);

        if (isNotFourDigit(number))
        {
            System.out.println("Not a 4-digit number!");
        }
        else
        {
            System.out.println("A 4-digit number!");


        }
    }

    private static boolean isNotFourDigit(int number)
    {
        return (String.valueOf(number).length() != 5 && String.valueOf(number).startsWith("-"))
                || (String.valueOf(number).length() != 4 && !String.valueOf(number).startsWith("-"));
    }
}
