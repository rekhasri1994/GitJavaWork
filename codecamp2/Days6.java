package codecamp2;
import java.util.Scanner;
public class Days6 {

	    public static void main(String args[])
	    {
	        int m, year, months, day;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of days:");
	        m = s.nextInt();
	        year = m / 365;
	        m = m % 365;
	        System.out.println("Number of years:"+year);
	        months = m / 30;
	        m = m % 30;
	        System.out.println("Number of months:"+months);
	        day = m;
	        System.out.println("Number of days:"+day);
	    }
	}

