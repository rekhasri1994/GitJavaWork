package codecamp1;
import java.util.Scanner;
public class Car6 {

		public static void main(String[] args) {
			
		    int  b = 0, q = 0;
	        Scanner s = new Scanner(System.in);
	       // System.out.print("Enter no. of elements you want in array:");
	        //n = s.nextInt();
	        int p[] = new int[10];
	        int odd[] = new int[10];
	        int even[] = new int[10];
	        System.out.println("Enter all the elements:");
	        for(int a = 0; a < 10; a++)
	        {
	            p[a] = s.nextInt();
	        }
	        for(int a = 0; a < 10; a++)
	        {
	            if(p[a] % 2 != 0)
	            {
	                odd[b] = p[a];
	                b++;
	            }
	            else
	            {
	                even[q] = p[a];
	                q++;
	            }
	        }
	        System.out.print("Odd:");
	        if(b > 1)
	        {
	            for(int a = 0;a < (b-1); a++)
	            {
	                System.out.print(odd[a]+",");
	            }
	            System.out.print(odd[b-1]);
	        }
	        else
	        {
	            System.out.println("No number");
	        }
	        System.out.println("");
	        System.out.print("Even:");
	        if(q > 1)
	        {
	            for(int a = 0; a < (q-1); a++)
	            {
	                System.out.print(even[a]+",");
	            }
	        System.out.print(even[q-1]);
	        }
	        else
	        {
	            System.out.println("No number");
	        }
	    }

		}




