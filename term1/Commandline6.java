package term1;

import java.util.Scanner;

public class Commandline6 {

	public static void main(String[] args) 
	{
		System.out.println("command line arguments are");//TAKING INPUT BY COMMAND LINE ARGUMENTS
		if(true)
		{  
		String fname=(args[0]);
		String address=(args[1]);
	    String email=(args[2]);	
	    System.out.println("Full name:"+fname+"\n"+"Address:"+address+"\n"+"Email:"+" "+email);
	    
        }else
         System.out.println("insufficient data");

}
}