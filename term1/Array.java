package term1;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	
	   public static void main(String args[]) {
	      System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [100];
	      System.out.println("Enter the elements of the array one by one ");
	      
	      for(int i = 0; i<size; i++) {
	    	  
	         myArray[i] = s.nextInt();
	     }
	     System.out.println("Contents of the array are: "+Arrays.toString(myArray));
	   }
	}

