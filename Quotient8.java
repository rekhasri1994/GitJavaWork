package bootcamp1;

import java.util.Scanner;


public class Quotient8 {
 public static void main(String[] args)  {
  int dividend=0, divisor=0;
       
        dividend=Integer.parseInt(args[0]);
         
        divisor =Integer.parseInt(args[1]);
        System.out.println("Command line arguments are: " +dividend+ " " +divisor);
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient :" + quotient);
        System.out.println("Remainder : " + remainder);
        
          }
}


	

