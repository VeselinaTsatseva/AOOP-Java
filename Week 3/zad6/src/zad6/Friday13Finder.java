package zad6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class Friday13Finder {

    public static void printListOfAllFriday13(){
        Random random = new Random();
        int year = 1900 + random.nextInt(121);
        LocalDate date = LocalDate.ofYearDay(year, 13);
        while(date.getYear() == year){
            if(date.getDayOfWeek() == DayOfWeek.FRIDAY){
                System.out.printf("%s ", date);
            }
            date = date.plusMonths(1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printListOfAllFriday13();
    }
}
