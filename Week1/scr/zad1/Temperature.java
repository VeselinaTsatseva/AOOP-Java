package zad1;

import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("1.Convert Fahrenheit to Celsius\n2. Convert Celsius to Fahrenheit\nChoose option: ");
        int choice = input.nextInt();

        if (choice == 1)
        {
            convertFahrenheitToCelsius(input);
        }
        else if (choice == 2)
        {
            convertCelsiusToFarenheit(input);
        }
        else
        {
            System.out.println("Unknown option.");
        }

        // %d -> int, long
        // %f -> float, double
        // %s -> string
        // %b -> bool
        // %c -> char
    }

    private static void convertFahrenheitToCelsius()
    {
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        System.out.printf("Celsius: %.2f\n", celsius);
    }

    private static void convertCelsiusToFarenheit()
    {
        System.out.print("Enter Celsuis: ");
        double celsiusInput = input.nextDouble();
        double farenheit = 9.0 / 5.0 * celsiusInput + 32;
        System.out.printf("Fahrenheit: %.2f\n", farenheit);
    }
}
