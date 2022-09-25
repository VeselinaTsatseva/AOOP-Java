package formatters;


import java.text.NumberFormat;
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
public class Purchase {

    public static void main(String[] args) {
        final double TAX_RATE = 0.06; // 6% sales tax
        int quantity;
        double subtotal, tax, totalCost, unitPrice;
        Scanner scan = new Scanner(System.in);
        Locale loc = new Locale("BG","BG");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(loc);
        NumberFormat fmtCurrency = NumberFormat.getCurrencyInstance();
        NumberFormat fmtPercent = NumberFormat.getPercentInstance();
        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();
        System.out.print("Enter the unit price: ");
        unitPrice = scan.nextDouble();
        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
         // Print output with appropriate formatting
        System.out.println("Subtotal: " + fmtCurrency.format(subtotal));
        System.out.println("Tax: " + fmtCurrency.format(tax) + " at "
                                   + fmtPercent.format(TAX_RATE));
        System.out.println("Total: " + fmtCurrency.format(totalCost));
         System.out.println("Total: " + formatter.format(totalCost));
    }
}
