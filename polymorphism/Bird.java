package polymorphism;

public class Bird 
{   //instance variables or class variables
	public String birdName;
	public StringBuilder birdColor;
	public static int legs=2,wings=2;
	private boolean canSing;
    protected int tails=1;
	
	//methods to desc behavior of object
	public boolean isCanSing()
	{
		return canSing;
		
	}
	public void setCanSing(boolean canSing)
	{
		this.canSing=canSing;
	}
	//defining fly method in bird class
    public void fly()
    {
    	System.out.println("start swinging status");
    	System.out.println("balance body");
    	System.out.println("observe wind direction");
    	System.out.println("based on that swing left or right wing");
    }
}
