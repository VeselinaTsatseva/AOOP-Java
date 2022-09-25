package hw3;

import java.util.Scanner;

public class RouteCipherTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RouteCipher routeCipher = new RouteCipher(-5);

        System.out.print("1.Encrypt\n2.Decrypt\nEnter choice: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1){
            System.out.print("Enter text: ");
            String text = input.nextLine();
            System.out.printf("Encrypted text: %s\n", routeCipher.encrypt(text));
        } else if (choice == 2){
            System.out.print("Enter encrypted text: ");
            String cipherText = input.nextLine();
            System.out.printf("Decrypted text: %s\n", routeCipher.decrypt(cipherText));
        } else {
            System.out.println("Unknown option.");
        }

       // plain text "ABORT THE MISSION YOU HAVE BEEN SPOTTED"
       // cipher text "TIEIXTXXEAHSIHSPNTLT"
    }
}
