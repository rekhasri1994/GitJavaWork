package codecamp2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Srting9 {
	public static void main(String args[]) throws IOException
	{
	  int i;
	  int size,  j;
	  String temp;
	  String arr[]=new String[10];
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	  System.out.println("Enter 10 strings");
	  for(i=0; i<10; i++)
	   {
		   arr[i]=br.readLine();
	   }
		for(i=0;i<10;i++)
		
	    System.out.println("lenth of string  "+arr[i]+" " +"is "+arr[i].length());
	      
	}
}

