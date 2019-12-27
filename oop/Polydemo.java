package oop;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class Polydemo
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int x=0,y=0;
		int choice=0;
		float a=0,b=0;
		double result=0.0;
	     sc=new Scanner(System.in);
	     DecimalFormat df = new DecimalFormat("##.00");
		out.print("1.add 2 integers\n2.add 2 real numbers\n3.exit");
		out.print("\nenter your choice(1-3):");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1 : result= add(x,y);
		         break;
		case 2 : result= add(a,b);
		         break;
		case 3:  break;
		}
		
		out.println("result:" +df.format(result));

	}
     
	public static int add(int x, int y)  
	{
		out.print("enter integer 1");
		x=sc.nextInt();
		out.print("enter integer 2");
		y=sc.nextInt();
		return x+y;
		
		
	}
	public static float add(float a, float b)  
	{
		out.print("enter a value");
		a=sc.nextFloat();
		out.print("enter b value");
		b=sc.nextFloat();
		return a+b;
		
		
	}
}
