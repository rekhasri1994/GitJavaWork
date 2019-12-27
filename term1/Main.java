package term1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		  int nos = 0;
		  System.out.println("Enter the number of address");
		  nos = Integer.parseInt(br.readLine());
		  for(int i=0;i<nos;i++)
			
		  {	
		  System.out.println("Enter the address "+(i+1)+" detail");
		  String str=br.readLine();
		  }
		  List<Address> list = new ArrayList<Address>();
		  
		   while(nos>0) { 
		    Address ad=new Address(); 
		  String input = br.readLine();
		  
		  String array[]=input.split(",");
		  
		   ad.setAddressLine1(array[0]); 
		   ad.setAddressLine2(array[1]);
		   ad.setCity(array[2]);
		   ad.setState(array[3]);
		   ad.setPinCode(Integer.parseInt(array[4]));
		  //add object to the list
		   System.out.println("Enter the state to be searched");
		   String city=br.readLine();
		   System.out.println("Enter the city to be searched");
		   String state=br.readLine();
		   System.out.printf("%-15s %-15s %-15s %-15s %s\n",ad.getAddressLine1());
		   System.out.printf("%-15s %-15s %-15s %-15s %s\n",ad.getAddressLine2());
		   System.out.printf("%-15s %-15s %-15s %-15s %s\n",ad.getCity());
		   System.out.printf("%-15s %-15s %-15s %-15s %s\n",ad.getState());
		   System.out.printf("%-15s %-15s %-15s %-15s %s\n",ad.getPinCode());
		   ad.add(list); 
		   nos--;
		   
		  }
	}
}










