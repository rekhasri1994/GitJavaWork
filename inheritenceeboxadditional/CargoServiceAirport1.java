package inheritenceeboxadditional;

public class CargoServiceAirport1 extends Airport1{
	private int noOfcargoUnitsperflight;
	public int calculatenoOfCargounits(int num,int numcar)
	{
		return noOfcargoUnitsperflight=num*numcar;
		
	}
}
