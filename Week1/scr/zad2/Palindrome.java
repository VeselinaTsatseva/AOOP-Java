package zad2;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five-digit number: ");
        String userInput = input.nextLine();
        int number = Integer.parseInt(userInput);

        if(isNotFiveDigitNumber(number))
        {
            System.err.println("Entered number is not five digits!");
        }
        else
        {
            System.out.println("Entered number is five digits!");
            int originalNumber = number;
            int fifthDigit = number % 10;
            number /= 10;  // number = number / 10
            int fourthDigit = number % 10;
            number /= 10;
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number % 10;

            String resultString;
            if(firstDigit == fifthDigit && secondDigit == fourthDigit)
            {
                resultString = "Number is palindrome";
            }
            else
            {
                resultString = "Number is not palindrome";
            }
            System.out.println(resultString);
        }
    }

    private static boolean isNotFiveDigitNumber(int number)
    {
        return String.valueOf(number).startsWith("-") && String.valueOf(number).length() != 6
                ||(!String.valueOf(number).startsWith("-") && String.valueOf(number).length() != 5);
    }
}
