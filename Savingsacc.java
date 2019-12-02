package banking;

public class Savingsacc
{
    private double accno;
    
    public Savingsacc()
    {
    	
    }
	public Savingsacc(double accno) {
		super();
		this.accno = accno;
	}

	public double getAccno() {
		return accno;
	}

	public void setAccno(double accno) {
		this.accno = accno;
	}
    public void display()
    {
    	System.out.println("this is savings account ");
    }
    
   
    
    
    
}