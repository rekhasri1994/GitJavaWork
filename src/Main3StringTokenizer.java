import java.util.Scanner;
	import java.util.StringTokenizer;
public class Main3StringTokenizer {
	

	    public static void main(String[] args) {
			
	        Scanner scan= new Scanner(System.in);
			
			//System.out.println("Enter the string");
			String st= scan.nextLine();
			
			StringTokenizer st1= new StringTokenizer(st,"=");
			StringBuffer sb= new StringBuffer();
			
			String a=null;
			
			while(st1.hasMoreElements())
			{
				sb.append(st1.nextElement()).append(" ");
			} 
			
			a= sb.toString();
			StringTokenizer st2= new StringTokenizer(a,";");
			StringBuffer sb2= new StringBuffer();
			
			while(st2.hasMoreElements())
			{
				sb2.append(st2.nextElement()).append("\n");
			} 
			
			st= sb2.toString();
			
			//System.out.println("Sample output");
			System.out.println(st);

		}

	}

