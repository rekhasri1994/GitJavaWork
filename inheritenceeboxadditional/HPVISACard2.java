package inheritenceeboxadditional;

public class HPVISACard2 extends VISACard2 
{
	@Override
	public Double computeRewardPoints(String purchaseType, Double amount)
	{
		
		return (amount*0.01)+10;
		
}
}
