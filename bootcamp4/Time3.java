package bootcamp4;

import java.util.Scanner;

public class Time3 {
	

		public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner input = new Scanner(System.in);
		        String time = input.nextLine();
		        int hour = Integer.parseInt(time.substring(0,2));
		        int minute = Integer.parseInt(time.substring(3,5));
		        int second = Integer.parseInt(time.substring(6,8));
		        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
		            System.out.println("Valid test case");
		            System.out.println(String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second));
		        }
		        else
		        {
		        System.out.println("invalid");
		        }
		        
		    }
		
}
