import java.util.Scanner;
public class Main5regularexpression {
	

	
	    public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			
	        System.out.println("Enter the generated hall booking id to validate:");
			String s= scan.next();
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(!s.matches("[0-9]+"))
					count++;
			}
			if(count==0)
			{
				System.out.println("Valid Booking ID");
			}
			else
			{
				System.out.println("Invalid Booking ID");
			}
			
			

		}

	}


