package formatters;


import java.text.DecimalFormat;
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
public class CircleStats {

    public static void main(String[] args) {
        int radius;
        double area, circumference;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the circle's radius: ");
        radius = scan.nextInt();
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
        // Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("The circle's area: " + fmt.format(area));
        System.out.println("The circle's circumference: "
                + fmt.format(circumference));
    }
}
