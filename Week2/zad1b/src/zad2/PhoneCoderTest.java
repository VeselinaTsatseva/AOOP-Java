package zad2;

import java.util.Scanner;

public class PhoneCoderTest {
    public static void main(String[] args) {
        PhoneCoder phoneCoder = new PhoneCoder(4);
        System.out.println(phoneCoder);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter phone number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Encoded phone number: %s\n", phoneCoder.encode(phoneNumber));

        System.out.println("Enter coded phone number: ");
        String codedPhoneNumber = input.nextLine();
        System.out.println("Decoded phone number: %s\n", phoneCoder.decode(codedPhoneNumber));
    }
}
