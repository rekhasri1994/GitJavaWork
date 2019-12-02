package banking;

public class RecuuringAcc 
{
	private double accnumb;
	

	public RecuuringAcc(double accnumb) {
		super();
		this.accnumb = accnumb;
	}

	public double getAccnumb() {
		return accnumb;
	}

	public void setAccnumb(double accnumb) {
		this.accnumb = accnumb;
	}
	public void display()
	{
		System.out.println("this is recurring account");
	}
	

}
