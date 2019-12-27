package polymorphism;

public class Flight extends Bird implements inherit.Automobile
{
	private int wheels;
	public String flightNumber;
	private String airLines;
	public int getWheels;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}
	@Override
	public boolean selfdriven() {
		
		return true;
	}
	@Override
	public void fly()
	{   
		//we can call super class fly method also by using super keyword
		super.fly();
		System.out.print("flight "+ this.flightNumber +"belongs to "+ this.airLines +"starting... "+ "has " +this.tails+"tail decorated with one tail");
		System.out.println("start 1st engine");
		System.out.println("drive the flight towards runway");
		System.out.println("once flight reaches the runway");
		System.out.println("start scecond engine");
		System.out.println("takeoff");
	}

}
