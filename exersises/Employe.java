package exersises;

public class Employe implements Comparable {
   private int employeid;
   private StringBuilder employeName;
   private boolean employementStatus;
   private float employesalary;
   private String companyName;
   
   public Employe()
   {
	
    }
public Employe(int employeid, StringBuilder employeName, boolean employementStatus, float employesalary,
		String companyName) 
{
	super();
	this.employeid = employeid;
	this.employeName = employeName;
	this.employementStatus = employementStatus;
	this.employesalary = employesalary;
	this.companyName = companyName;
}
 public int getEmployeid() 
{
	return employeid;
}
public void setEmployeid(int employeid)
{
	this.employeid = employeid;
}
public StringBuilder getEmployeName()
{
	return employeName;
}
public void setEmployeName(StringBuilder employeName)
{
	this.employeName = employeName;
}
public boolean isEmployementStatus() 
{
	return employementStatus;
}
public void setEmployementStatus(boolean employementStatus)
{
	this.employementStatus = employementStatus;
}
public float getEmployesalary()
{
	return employesalary;
}
public void setEmployesalary(float employesalary) 
{
	this.employesalary = employesalary;
}
public String getCompanyName()
{
	return companyName;
}
public void setCompanyName(String companyName)
{
	this.companyName = companyName;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Employe emp2=(Employe)o;
	return (int)(employeid-emp2.employeid);
	
}
}
