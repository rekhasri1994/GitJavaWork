package inherit;

public class Human {
	public static int legs=2;
	private boolean swimmingStatus;
	
	
	//Human constructor
	Human()
	{
		swimmingStatus=false;
		System.out.println("can swim");
	}
	public void brethe()
	{
		
		System.out.println("can brethe");
	}
	//static method
   public static void talk()
   {
	   System.out.println("can talk");
   }
   //non static method
   public void walk()
   {
	   System.out.println("can walk" +"with"+legs+"legs");
   }
}
