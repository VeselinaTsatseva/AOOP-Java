/* Chapter 2 of Java How to Program: Fourth Edition
   Debugging Problem /

public class Arithmetic {

import java.util.Scanner;
    
   static public void main(  )
   {
     
      int num2, num3, sum, product, average;
      Scanner input = Scanner(System.out);

      num1  = =  input.nextInt( "Enter first integer:" );

      num2  = = input.nextInt( "Enter second integer:" );
      
      num3 = = input.nextInt( "Enter third integer:" );
  
 
      
      sum = num1 + num2 + num3;
      product = num1 * num2 * num3;
      average = ( num1 + num2 + num3 ) / 3;
      
      System.in.print( "The sum is " + sum + 
         "\nThe product is " + product +  "\nThe average is" 
          + average, "Results");
   }

} // end class Arithmetic

