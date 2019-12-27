package polymorphism;

public class Flightdemo {

	public static void main(String[] args) 
	{   //creating object for flight class
		Flight f=new Flight();
		//set values to flight class attributes or properties or class instance variable
		f.flightNumber="AI309";
		//f.tails=1
		f.setWheels(16);
		f.setAirLines("air india");
		//calling methods of flight class
		f.fly();
	}

}
