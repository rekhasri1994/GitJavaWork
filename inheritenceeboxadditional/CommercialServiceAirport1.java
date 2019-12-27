package inheritenceeboxadditional;

public class CommercialServiceAirport1 extends Airport1 {
	private int noOfpassengersperflight;
	
	public int calculatenoOfPassengers(int num,int numpass)
	{
		return noOfpassengersperflight=num*numpass;
		
	}
}
