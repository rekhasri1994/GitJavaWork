package inheritenceeboxadditional;

public class VISACard2 {
	private String holderName;	
	private String ccv;
	
	public Double computeRewardPoints(String purchaseType, Double amount)
	{
		purchaseType="fuel";
		return amount*0.01;
		
	}
}
