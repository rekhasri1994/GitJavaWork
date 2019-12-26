package codecamp2;
import java.util.Scanner; //import Scanner class in our program
public class Compare2
{
		
     public static void main(String args[])
	 {
				   
		Scanner sc=new Scanner(System.in);
		
	    int x[] = new int[5];
	    System.out.println("Enter array1 values");
	    for (int i = 0 ; i <x.length; i++ ) 
		{
			 x[i]=sc.nextInt();
		}
	    
		int y[] = new int[5];
		System.out.println("Enter array2 values");
	    for (int j = 0 ; j <x.length; j++ ) 
	    {
			  y[j]=sc.nextInt();
	    }
		int z[]=new int[5];
		System.out.println("common values are");
		for(int i = 0; i<x.length; i++ )
	      {
	         for(int j = 0; j<y.length; j++)
	         {
	            if(x[i]==y[j]) 
	            {
	               
	               System.out.println(y[j]);
	            }
	         }
	      }	      
		System.out.println("distinct values are");
	      for(int k = 0; k<5; k++ )
	      
	            if(x[k]!=y[k]) 
	            {
	               
	               System.out.println(x[k]);
	               System.out.println(y[k]);
	               
	            }
	         }
	      
	   }      
			   
			


