package codecamp1;

import java.util.Scanner;

public class Addition10 {
	public static void main(String args[])
	{
	int a, b;
	
    Scanner sc=new Scanner(System.in);
    
	System.out.println("Enter two numbers to add:");
	a=sc.nextInt();
    b=sc.nextInt();
    int sum=a+b;
	System.out.println (a);
	System.out.println (b);
	System.out.println ("The sum is:" +sum);
}
}