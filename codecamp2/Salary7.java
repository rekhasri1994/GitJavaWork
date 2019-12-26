package codecamp2;
import java.util.Scanner;
import java.text.DecimalFormat;
 class Salary7
 {
	    public static void main(String args[])
	    {
	        DecimalFormat df=new DecimalFormat("#.00");
	        int basicSalary=0;
	        double grossSalary=0.0, HRA=0.0,DA=0.0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter basic salary");
	        
	        basicSalary= sc.nextInt();
	        
	        
	        if(basicSalary<1500)
	        {
	            HRA=(0.10f*basicSalary);
	            DA=(0.9f*basicSalary);
	            grossSalary=(basicSalary+HRA+DA);
	            System.out.println("Gross salary is " +df.format(grossSalary));
	            
	        }
	        else
	        {
	            HRA=500;
	            DA=0.98f*basicSalary;
	            grossSalary=basicSalary+HRA+DA;
	            System.out.println("Gross salary is "+df.format(grossSalary));
	            
	        }
	        
	        
	    }
	}




