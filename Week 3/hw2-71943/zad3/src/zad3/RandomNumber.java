package zad3;

import java.text.NumberFormat;
import java.util.Random;

public class RandomNumber {

    public static int drawRandomNumber() {
        Random random = new Random();
        int integer = random.nextInt(3) + 1;
        return integer;
    }

    public static double percentage(int count, int amount){
        return (double) count / amount;
    }

    public static void main(String[] args) {

        int counter1 = 0, counter2 = 0, counter3 = 0;
        for (int i=0; i < 10000; i++) {
            int n = drawRandomNumber();
            if (n == 1){
                counter1++;
            }
            if (n == 2){
                counter2++;
            }
            if (n == 3){
                counter3++;
            }
        }
        NumberFormat defaultFormat = NumberFormat.getPercentInstance();
        defaultFormat.setMinimumFractionDigits(1);
        System.out.println("1 - " + defaultFormat.format(percentage(counter1, 10000)));
        System.out.println("2 - " + defaultFormat.format(percentage(counter2, 10000)));
        System.out.println("3 - " + defaultFormat.format(percentage(counter3, 10000)));

        for (int i=0; i < 60000; i++) {
            int n = drawRandomNumber();
            if (n == 1){
                counter1++;
            }
            if (n == 2){
                counter2++;
            }
            if (n == 3){
                counter3++;
            }
        }
        NumberFormat defaultFormat1 = NumberFormat.getPercentInstance();
        defaultFormat1.setMinimumFractionDigits(1);
        System.out.println("1 - " + defaultFormat1.format(percentage(counter1, 60000)));
        System.out.println("2 - " + defaultFormat1.format(percentage(counter2, 60000)));
        System.out.println("3 - " + defaultFormat1.format(percentage(counter3, 60000)));
    }
}
