package bootcamp2;

import java.util.Scanner;

public class Maxmin8 { 
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	       int arra[] = new int[5];
	       for (int i = 0 ; i <arra.length; i++ ) 
	    		  {
	    			  arra[i]=sc.nextInt();
	    			 
	    		  }
		   
		   int max = getMax(arra);
		   int min = getMin(arra);
		   System.out.println("Max = "+max+" & Min= "+min);
		 }
		 public static int getMax(int[] inputArray){ 
		   int maxValue = inputArray[0]; 
		   for(int i=1;i < inputArray.length;i++){ 
		     if(inputArray[i] > maxValue){ 
		        maxValue = inputArray[i]; 
		     } 
		   } 
		   return maxValue; 
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




