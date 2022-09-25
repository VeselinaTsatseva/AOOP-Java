package formatters;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author echrk
 */
public class LocalInput {

    public static void main(String[] args) {
        double value = 0.5;
        double inputValue;
        Scanner kbd = new Scanner(System.in);

        Locale.setDefault(Locale.ROOT);  // Language-neutral locale
        System.out.println(Locale.ROOT.getDisplayLanguage());
        System.out.printf("%f\n", value); // 0.500000
        System.out.println(value); // 0.5
        kbd.useLocale(Locale.ROOT);
        System.out.print("Enter a double type value[Neutral]:  ");
        inputValue = kbd.nextDouble(); // Expects 1.25
        System.out.println("    ");

        Locale.setDefault(Locale.ENGLISH);  // Language-neutral locale
        System.out.println(Locale.ENGLISH.getDisplayLanguage());
        System.out.printf("%f\n", value); // 0.500000
        System.out.println(value); // 0.5
        kbd.useLocale(Locale.ENGLISH);
        System.out.print("Enter a double type value[EN]:  ");
        inputValue = kbd.nextDouble(); // Expects 1.25
        System.out.println("    ");

        Locale lang = new Locale("bg", "BG");
        Locale.setDefault(lang); // Bulgarian locale
        System.out.println(lang.getDisplayLanguage());

        System.out.printf("%f\n", value); // 0,500000
        System.out.println(value); // 0.5
        // change the locale of the scanner
        kbd.useLocale(lang);
        System.out.print("Enter a double type value[BG]:  ");
        inputValue = kbd.nextDouble(); // Expects 1,25
        LocalTime now = LocalTime.now(); // Current time
        LocalTime bedtime = LocalTime.of(22, 30);
        // or LocalTime.of(22, 30, 0)
        // wakeup is 6:30:00
        LocalTime wakeup = bedtime.plusHours(8);
        int hour = wakeup.getHour();
        int minute = wakeup.getMinute();
        int second = wakeup.getSecond();
        System.out.printf("%02d:%02d:%02d  %n ", hour, minute, second);
        DateTimeFormatter formatted = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(formatted.format(bedtime));
        formatted = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(formatted.format(LocalDate.now()));
        formatted = DateTimeFormatter.ofPattern("EEEE: yyyy-MM-dd");
        System.out.println(formatted.format(LocalDate.now()));
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()));
    }
}
