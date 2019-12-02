package banking;

public class Account
{
	private String acctype,username,ifscno;
	private double accountnum,bal;
	
	
	public Account()
	{
		//tor stub
	}
	public Account(String acctype, String username, String ifscno, double accountnum, int bal) {
		super();
		this.acctype = acctype;
		this.username = username;
		this.ifscno = ifscno;
		this.accountnum = accountnum;
		this.bal = bal;
	
	}
	public String getAcctype() {
		return acctype;
	}


	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getIfscno() {
		return ifscno;
	}


	public void setIfscno(String ifscno) {
		this.ifscno = ifscno;
	}


	public double getAccountnum() {
		return accountnum;
	}


	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}


	public double getBal() 
	{
		return bal;
	}


	public void setBal(int bal) {
		this.bal = bal;
	}
  
    public void display()
    {
    	System.out.println("this is account");
    }
	
}