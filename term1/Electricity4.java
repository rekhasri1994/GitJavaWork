package term1;
import java.util.Scanner;
public class Electricity4 {
		private static Scanner sc;
		  public static void main(String[] args) 
		  {
		   String name;
		   int Units; 
		   double BillAmount;//initializing variables
		   sc = new Scanner(System.in);
		   System.out.println("Enter Customer name:");
		   name=sc.next();
		   System.out.print(" Please Enter the Units that you Consumed  : ");
		   Units = sc.nextInt();
		   
		   BillAmount = Electricity(Units);
		   System.out.println("\n Electricity Bill  =  " + BillAmount);
		  }
		  public static double Electricity(int Units)//Electricity method
		  {
		   double unitscharged,Amount,Servicetax=14.75,BillAmount;
		   int fixedrent=250;
		   if (Units <=100)
		     {
		          unitscharged = Units * 3.25;
		          
		           
		     } 
		     else if (Units <= 200)
		     {
		      unitscharged= Units * 4.75;
		      
		     }
		     
		     else
		     {
		      unitscharged = Units * 6.35; 
		       
		   }
		   Amount=unitscharged+fixedrent;
		   BillAmount = Amount* Servicetax;//calculating bill amount
		   return BillAmount;
		  }
		 }


