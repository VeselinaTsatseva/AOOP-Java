package hammingDistance;

import java.util.Scanner;

public class HammingDistance {

   static int getHammingDistance(int number1, int number2){
       int x = number1 ^ number2;
       int distance = 0;

       while (x > 0)
       {
           distance += x & 1;
           x >>= 1;   // махаме един бит
       }

       return distance;
   }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int number1 = userInput.nextInt();
        int number2 = userInput.nextInt();

        System.out.printf("The hamming distance between %d and %d is %d", number1,
                number2, getHammingDistance(number1, number2));
    }
}
