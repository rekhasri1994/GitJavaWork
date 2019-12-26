package bootcamp3;
import java.util.Scanner;
public class Bankmain5 {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			long acct_no;
			String customer_name, trans_type;
			double trans_amount, bal_amount;
			Scanner sc = new Scanner(System.in);        // reading input from keyboard
			System.out.println("Enter Customer Name");
			customer_name = sc.next();
			System.out.println("Enter Account Number");
			acct_no = sc.nextLong();
			System.out.println("Enter Transtion Type");
			trans_type = sc.next();
			System.out.println("Enter Trans Amount");
			trans_amount = sc.nextLong();
			System.out.println("Enter Balance");
			bal_amount = sc.nextDouble();
			Bank b = new Bank(acct_no, customer_name, trans_type, trans_amount, bal_amount); // crating obj and sending variable details
			b.transaction();  // calling method

		}

	}


