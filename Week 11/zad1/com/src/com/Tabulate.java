package com;

import services.Computable;

import java.util.Scanner;

public class Tabulate {

    private Computable callback;

    public Tabulate(Computable callback) {
        setCallback(callback);
    }

    public Computable getCallback() {
        return callback;
    }

    public void setCallback(Computable callback) {
        this.callback = callback;
    }

    public void tabulate(double a, double b, int steps){
        tabulateFunction(a, b, steps, callback);
    }

    public static void tabulateFunction(double a, double b, int steps, Computable computable){
        if(a > b){
            System.out.println("Please input a correct interval.");
            return;
        }

        if (steps <= 0){
            System.out.println("Please input a positive number of steps");
            return;
        }

        if(computable == null){
            System.out.println("Invalid computable reference.");
            return;
        }

        double step = (b - a) / steps;
        Scanner input = new Scanner(System.in);

        System.out.printf("%-20s%-20s\n", "X", "F(X)");
        int iterations = 0;
        for (double x = a; x < b; x += step) {
             if(iterations > 0 && iterations % 20 == 0){
                 System.out.println("Press Enter to continue...");
                 input.nextLine();
             }

            System.out.printf("%-20.2f%-20.2f\n", x, computable.function(x));
             iterations++;
        }
    }
}
