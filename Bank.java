package banking;

public class Bank 
{
     private String name,ifsc;
     private int bankid;
     public Bank()
     {
    	 
     }
     
     
	public Bank(String name, String ifsc, int bankid) {
		super();
		this.name = name;
		this.ifsc = ifsc;
		this.bankid = bankid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	} 
	public void display()
	{
		System.out.println("this is bank");
	}
}