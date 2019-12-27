package exersises;

import exersises.Employe;

public class Employedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe emp1=new Employe();
		emp1.setCompanyName("Hcl");
		emp1.setEmployeid(111);
		emp1.setEmployeName(new StringBuilder("rekha"));
		emp1.setEmployementStatus(true);
		emp1.setEmployesalary(50000.00f);
      
		
		Employe emp2=new Employe();
		emp2.setCompanyName("Hcl");
		emp2.setEmployeid(200);
		emp2.setEmployeName(new StringBuilder("rekha"));
		emp2.setEmployementStatus(true);
		emp2.setEmployesalary(50000.00f);

	    if(emp1.compareTo(emp2)==0)
	    {
	    	System.out.print("both objects employe ids are same");
	    }else
	    {
	    	System.out.print("both objects employe ids are  not same");
	    }

}
}