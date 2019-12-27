package bootcamp1;
import java.util.Scanner;

public class Apples3 
 {
	 public static void main(String[] args) {
	  int xor, and, temp,X=0,Y=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Number of apples:");
	  X=sc.nextInt();
	   
	   System.out.println("Number of apples to be added:");
	   Y=sc.nextInt();
	  
	  and = X & Y;
	  xor = X ^ Y; 
	  while(and != 0 )
	  {
	  and <<= 1; 
	  temp = xor ^ and;
	  and &= xor; 
	  xor = temp; 
	  }
	  System.out.println("Total number of apples:" +xor);
	     
	 }
	}