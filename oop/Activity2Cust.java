package oop;

import java.util.Scanner;

public class Activity2Cust {

	public static void main(String[] args) 
	{
		String name,address,dob,destiname,reason,status,deprdate;
		  int age,mobileno;
		
		   Scanner sc=new Scanner(System.in);
	       {
		  
		     System.out.println("enter the name is:");
		     name =sc.next();
		     System.out.println("enter address:");
		     address=sc.next();
		     System.out.println("enter dob:");
		     dob=sc.next();
		     System.out.println("enter destiname:");
		      destiname=sc.next();
		     System.out.println("enter reason:");
		     reason=sc.next();
		     System.out.println("enter status:");
		     status=sc.next();
		     System.out.println("enter departure date:");
		     deprdate=sc.next();
		     System.out.println("enter age:");
		     age=sc.nextInt();
		     System.out.println("enter phone number:");
		     mobileno=sc.nextInt();
		     
		     System.out.println("name:" +name );
		     System.out.println("address:" +address );
		     System.out.println("dob:" +dob);
		     System.out.println("destiname:" +destiname);
		     System.out.println("reason:" +reason);
		  }  

	}

}
