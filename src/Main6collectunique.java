import java.io.*;
	import java.text.*;
	import java.util.*;
public class Main6collectunique {
	
		    public static void main(String args[]) throws IOException{
	        // fill the code
	         HashSet<String> hs = new HashSet<String>();
	      
	      Scanner scan=new Scanner(System.in);
	      System.out.println("Enter number of words:");
	      int n=scan.nextInt();
	      
	      for(int i=0;i<n;i++)
	      {
	          hs.add(scan.next());
	      }
	      
	       System.out.println("Unique set of words:");
	      List<String> list = new ArrayList<String>(hs); 
	        Collections.sort(list); 
	        
	       for(String s:list)
	       {
	          System.out.println(s); 
	       }
	      
	        
	        
	    }
	}

