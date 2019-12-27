package oop;

import java.util.Scanner;

public class Actvity1Account
   {
       public static void main(String[] args)
       {
          
		   String sname,accounttype,ifsc;
		   int accno,bal;
		   Scanner sc=new Scanner(System.in);
	       {
		  
		     System.out.println("enter the name is:");
		     sname =sc.next();
		     System.out.println("enter account type:");
		     accounttype=sc.next();
		     System.out.println("enter account num:");
		     accno=sc.nextInt();
		     System.out.println("enter ifsc:");
		     ifsc=sc.next();
		     System.out.println("enter balance:");
		     bal=sc.nextInt();
		     
		     System.out.println("name:" +sname );
		     System.out.println("account type:" +accounttype );
		     System.out.println("account num:" +accno);
		     System.out.println("ifsc:" +ifsc);
		     System.out.println("balance is:" +bal);
		  }  

}            
       
   }   
