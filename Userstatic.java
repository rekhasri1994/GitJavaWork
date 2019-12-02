package alloppsconceptsAEIP;

public class Userstatic
{
	private static int gUserid=100;
	private int id;
	private String name;
	public Userstatic(String nm)
	{
		this.id=generateUserid();
		this.name=nm;
	}
	private int generateUserid() 
	{
		++gUserid;
		return gUserid;
		
	}
	public String getName()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}

}
