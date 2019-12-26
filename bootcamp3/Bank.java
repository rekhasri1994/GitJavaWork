package bootcamp3;

public class Bank {


	private long acct_no; // Declaring variables
	private String customer_name, trans_type;
	private double trans_amount, bal_amount;

	public Bank(long acct_no, String customer_name, String trans_type, double trans_amount, double bal_amount) { // Constructor
																													// to
																													// initialize
																													// the
																													// variables
		super();
		this.acct_no = acct_no;
		this.customer_name = customer_name;
		this.trans_type = trans_type;
		this.trans_amount = trans_amount;
		this.bal_amount = bal_amount;
	}

	public void transaction() // creating the method
	{
		double amount = 0;
		if (trans_type.equals("withdrawal")) { //  checking condition trans is withdral or not
			if (trans_amount <= bal_amount) {  //checking if sufficient amount is avilable in your acc or not
				amount = bal_amount - trans_amount;   // removing tra amount from available balance
				
			} else {
				System.out.println("invaid transaction");
			}
		}
		if (trans_type.equals("deposit")) {  // checking the condition for deposit
			amount = bal_amount + trans_amount;  //adding the amount to balance
			
		}
		System.out.println("Customer Name :" + customer_name);
		System.out.println(" Account Number :" + acct_no);
		System.out.println(" Transtion Type :" + trans_type);
		System.out.println(" Trans Amount :" + trans_amount);
		System.out.println("old Balance" + bal_amount);
		System.out.println("New Balance" + amount);

	}
}
