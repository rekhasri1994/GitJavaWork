import java.util.Scanner;

public class Multipledelimiteraddition4 {
	
	
	    public static void main(String[] args)
		{
			Scanner sca= new Scanner(System.in);  // Setting a Scanner
			
			System.out.println("Enter detail (start time1|end time1,start time2|end time2)");
			String str= sca.next();                        // Reading a String
			
			String p[]= str.split(",");                   //Splitting based on ','
			
			System.out.println("Call Details");
			System.out.println("Number of calls made : "+p.length);
			
		    for(int i=0;i<p.length;i++) 
		    {
		    	String q[]= p[i].split("\\|");             //Splitting based on '|'
		    	System.out.println("Call "+(i+1)+" :");
		    	for(int j=0;j<q.length;j++)                    //printing call log
		    	{
		    		if(j%2==0)
		    		{
		    			System.out.println("Start Time : "+q[j]);
		    		}
		    		else
		    		{
		    			System.out.println("End Time : "+q[j]);
		    		}
		    	}
		    }
		}
	}

