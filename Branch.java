package banking;

public class Branch 
{
	private int branchid,locationid;
	public Branch()
	{
		System.out.println("branch");
	}
	public Branch(int branchid,int locationid)
	{
		this.branchid=branchid;
		this.locationid=locationid;
		System.out.println("branchid="+branchid+ "\nlocationid="+locationid);
	}
	
  
	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public void display()
	{
		System.out.println("this is branch");
	}
	

}