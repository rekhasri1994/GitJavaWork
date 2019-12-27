package javafundamentals;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i, space, rows, k=0;
	Scanner scan =new Scanner(System.in);
	System.out.print("enter no.of rows:");
	rows = scan.nextInt();
	for(i=1;i<=rows;i++)
	{
		for(space=1; space<=(rows-i);space++)
		{
			System.out.print(" ");
			
		}while(k != (2*i-1))
		{
			System.out.print("* ");
			k++;
		}
			k = 0;
			System.out.println();
	}
	
	
	
	
	
	}
	

}
