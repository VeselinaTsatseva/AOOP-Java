package formatters;


import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author echrk
 */
public class RoundingNumbers {

    public static void main(String[] args) {
        double dblNum1 = 2.32;
        double dblNum2 = 2.55;
        double dblNum3 = 2.65;

        NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
        nf.setMaximumFractionDigits(1);
        nf.setRoundingMode(RoundingMode.UP);

        System.out.println(nf.format(dblNum1));
        System.out.println(nf.format(dblNum2));
        System.out.println(nf.format(dblNum3));

        System.out.println();

        nf.setRoundingMode(RoundingMode.DOWN);

        System.out.println(nf.format(dblNum1));
        System.out.println(nf.format(dblNum2));
        System.out.println(nf.format(dblNum3));

        System.out.println();
    }
}
