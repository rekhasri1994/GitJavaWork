package oop;

public class Bird 
{
	public static int legs=2;
	public static int wings=2;
	public String birdName;
	public String birdColor;
	private boolean singStatus;
	
	Bird() 
	{
		legs=2;
		wings=2;
	}
		
	//setter method to set value for private variables
	public void setsingingStatus() 
	{
	   if(this.birdName.equalsIgnoreCase("kokila"))
	   {
		   singStatus=true;
	   }
	}
	public void walk()
	{
		System.out.println(birdColor+" " +birdName+" is walkinging with"+legs+" legs.");
	}
	public void fly()
	{
		System.out.println(birdColor+" " +birdName+" is flying with "+wings+" wings.");
	}
	public void sing() 
	{
		if(singStatus)
		{
			System.out.println("la ra loo.....la ra loo....");
		}else
		{
			System.out.println("cant sing");
		}
	}
} 
