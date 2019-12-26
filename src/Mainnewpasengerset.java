import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Mainnewpasengerset {



	
	
	    public static void main(String[] args) {
	 ArrayList<String> arl=new ArrayList<String>();
	  
	  Scanner scan=new Scanner(System.in);
	  int num1,num2,count;
	  System.out.println("Enter the number of passengers in the list:");
	  num1=scan.nextInt();
	  System.out.println("Enter the passengers names:");
	  for(int i=0;i<num1;i++)
	        {
	         arl.add(scan.next());
	         
	        }
	  System.out.println("Enter the number of passengers who have not arrived to the airport on time");
	  num2=scan.nextInt();
	  System.out.println("Enter the passenger who are not arrived airport on time:");
	  for(int i=0;i<num2;i++)
	        {
	            arl.add(scan.next());
	         
	        }
	  
	  System.out.println("New passengers list:");
	 HashSet<String> hsUnique = new HashSet<String>(arl);
	       List<String> list = new ArrayList<String>(hsUnique); 
	       Collections.sort(list);
	      for(String s :list)
	      {
	        
	        count=Collections.frequency(arl, s);
	       if(count==1)
	       {
	       
	       System.out.println(s); 
	       }
	 }
	 
	 }
	}


