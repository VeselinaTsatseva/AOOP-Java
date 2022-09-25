package zad3;

import java.util.Scanner;

public class TelephoneEncryptor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four-digit number: ");
        String userInput = input.nextLine();
        int number = Integer.parseInt(userInput);

        if(isNotFourDigitNumber(number))
        {
            System.err.println("Entered number is not four digits!");
        }
        else
        {
            System.out.println("Entered number is four digits!");
            int originalNumber = number;

            int fourthDigit = number % 10;
            number /= 10;
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number % 10;

            firstDigit = (firstDigit + 7) % 10;
            secondDigit = (secondDigit + 7) % 10;
            thirdDigit = (thirdDigit + 7) % 10;
            fourthDigit = (fourthDigit + 7) % 10;

            int temp = firstDigit;
            firstDigit = thirdDigit;
            thirdDigit = temp;

            temp = secondDigit;
            secondDigit = fourthDigit;
            fourthDigit = temp;

            System.out.printf("Encrypted number: %d%d%d%d", firstDigit, secondDigit, thirdDigit, fourthDigit);
        }
    }

    private static boolean isNotFourDigitNumber(int number)
    {
        return String.valueOf(number).startsWith("-") && String.valueOf(number).length() != 5
                ||(!String.valueOf(number).startsWith("-") && String.valueOf(number).length() != 4);
    }
}
