package computation;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author echrk
 */
public class KmToMilesMethods {
    //  constants
    private static final double MILES_PER_KILOMETER = 0.621; 
    private static final Scanner KBD = new Scanner(System.in); 
    public static void main(String[] args) {
        double kms   = getDouble("Enter number of kilometers.");
        double miles = convertKmToMi(kms);
        displayString(kms + " kilometers is " + miles + " miles.");
        System.out.println(Math.ceil(-2.1) );
    }
    // Conversion method - kilometers to miles.
    private static double convertKmToMi(double kilometers) {
        double miles = kilometers * MILES_PER_KILOMETER;
        return miles;
    }
    // I/O convenience method to read a double value.
    private static double getDouble(String prompt) {
        String tempStr;
        System.out.print(prompt);
        return KBD.nextDouble();
    }

    // I/O convenience method to display a string in dialog box.
    private static void displayString(String output) {
        System.out.println(output);
    }
}
