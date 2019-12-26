package codecamp2;

import java.util.Scanner;

public class Smallest8 {

	public static void main(String args[])
	{
	    int i;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 10 elements");
		for(i=0; i<10; i++)
	       {
		     arr[i]=sc.nextInt();
		
	     }
		
		   int min = getMin(arr);
		   System.out.println("smallest integer is = "+min);
		 }
		 
		 
		 public static int getMin(int[] inputArray){ 
		   int minValue = inputArray[0]; 
		   for(int i=1;i<inputArray.length;i++){ 
		     if(inputArray[i] < minValue){ 
		       minValue = inputArray[i]; 
		     } 
		   } 
		   return minValue; 
		 } 
		
}

