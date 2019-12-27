package inherit;

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
		emp2.setEmployeid(111);
		emp2.setEmployeName(new StringBuilder("rekha"));
		emp2.setEmployementStatus(true);
		emp2.setEmployesalary(50000.00f);

	}

}
