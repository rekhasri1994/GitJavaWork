package bootcamp2;
import java.util.Scanner; //import Scanner class in our program

public class Intersection5 {
	
		   public static void main(String args[])
		   {
			   
			   Scanner sc=new Scanner(System.in);
		       int x[] = new int[5];
		       for (int i = 0 ; i <x.length; i++ ) 
		    		  {
		    			  x[i]=sc.nextInt();
		    			
		    			 
		    		  }
		      int y[] = new int[5];
		      for (int j = 0 ; j <x.length; j++ ) 
		      {
		    			  y[j]=sc.nextInt();
		    		  }
		       int z[]=new int[5];
		      
		      
		       
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
		   }
		}



