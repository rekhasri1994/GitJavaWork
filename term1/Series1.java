package term1;
import java.util.Scanner;
public class Series1 {
	public static void main(String[] args) 
	{
		 int i,n;
		 int y=3;
		 int s=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter n value");
		 n=sc.nextInt();
		 for(i=0;i<n;i++)
		 {
			 System.out.println(s+" ");
			 s=s+y;
			 y=y+2;
			 
		 }
	}
}
	
		
		
	
	

	 
	
