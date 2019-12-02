package alloppsconceptsAEIP;


	import java.util.Scanner;
	public class Account1 
	{
	          
			   private String sname,accounttype,ifsc;
			   private int accno,bal;
			   
			   public Account1()
			   {
				   
			   }
			   
			   
			   
			   public Account1(String sname, String accounttype, String ifsc, int accno, int bal) {
				super();
				this.sname = sname;
				this.accounttype = accounttype;
				this.ifsc = ifsc;
				this.accno = accno;
				this.bal = bal;
			}
			public String getSname() 
			   {
				return sname;
			   }
			public void setSname(String sname) {
				this.sname = sname;
			}
			public String getAccounttype() {
				return accounttype;
			}
			public void setAccounttype(String accounttype) {
				this.accounttype = accounttype;
			}
			public String getIfsc() {
				return ifsc;
			}
			public void setIfsc(String ifsc) {
				this.ifsc = ifsc;
			}
			public int getAccno() {
				return accno;
			}
			public void setAccno(int accno) {
				this.accno = accno;
			}
			public int getBal() {
				return bal;
			}
			public void setBal(int bal) {
				this.bal = bal;
			}
			public void display() 
			{
				System.out.print("this is account");
			}
			
			  /* Scanner sc=new Scanner(System.in);
		       {
			  
			    System.out.println("enter the name is:");
			     sname =sc.next();
			     System.out.println("enter account type:");
			     accounttype=sc.next();
			     System.out.println("enter account num:");
			     accno=sc.nextInt();
			     System.out.println("enter ifsc:");
			     ifsc=sc.next();
			     System.out.println("enter balance:");
			     bal=sc.nextInt();
			     
			     System.out.println("name:" +sname );
			     System.out.println("account type:" +accounttype );
			     System.out.println("account num:" +accno);
			     System.out.println("ifsc:" +ifsc);
			     System.out.println("balance is:" +bal);
			  }    */
	   }   

