package Arith;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int bnum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binay number");
		String bv = sc.nextLine();
		 int bnum1=Integer.parseInt(bv,2);
		 System.out.println("The integer value of the binary number "+bv +" is " +bnum1);
		System.out.println("Enter the octal number");
		String onum = sc.nextLine();
		int num=Integer.parseInt(onum,8);
		System.out.println("The integer value of the octal number "+onum +" is " +num);
		System.out.println("Enter the hexadecimal number");
		String hd = sc.nextLine();
		int hnum=Integer.parseInt(hd,16);
		System.out.println("The integer value of the hexadecimal number "+hd +" is " +hnum);

	}

}
