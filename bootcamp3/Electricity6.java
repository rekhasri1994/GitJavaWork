package bootcamp3;
import java.util.Scanner;
public class Electricity6 {
	
	
	private static Scanner sc;
	  public static void main(String[] args) 
	  {
	   String name;
	   int Units; 
	   double BillAmount;
	   sc = new Scanner(System.in);
	   System.out.println("Enter Customer name:");
	   name=sc.next();
	   System.out.print(" Please Enter the Units that you Consumed  : ");
	   Units = sc.nextInt();
	   
	   BillAmount = Electricity(Units);
	   System.out.println("\n Electricity Bill  =  " + BillAmount);
	  }
	  public static double Electricity(int Units)
	  {
	   double Amount, Sur_Charge, BillAmount;
	   if (Units <=50)
	     {
	          Amount = Units * 0.50;
	      Sur_Charge = Amount*0.2;   
	     } 
	     else if (Units <= 150)
	     {
	      Amount = Units * 0.75;
	      Sur_Charge = Amount*0.2;  
	     }
	     else if (Units <= 250)
	     {
	      Amount = Units * 1.20;
	      Sur_Charge = Amount*0.2;  
	     }
	     else
	     {
	       Amount = Units * 1.50; 
	       Sur_Charge = Amount*0.2; 
	   }
	   
	   BillAmount = Amount + Sur_Charge;
	   return BillAmount;
	  }
	 }





