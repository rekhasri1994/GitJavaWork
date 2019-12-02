package banking;

public class Fixedaccou extends Bank
{
    private double accnum;
    

	public Fixedaccou(double accnum) {
		super();
		this.accnum = accnum;
	}

	public double getAccnum() {
		return accnum;
	}

	public void setAccnum(double accnum) {
		this.accnum = accnum;
	}
	public void display()
	{
		System.out.println("this is fixed account");
	}
    
    
    
}