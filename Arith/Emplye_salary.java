package Arith;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Emplye_salary {
     
	
	static String emp_name[]= {"rekha","ram","sai"};
			
	static float emp_sal[]= {50120.00f,45524.00f,54200.00f};
	static int emp_age[];
	
	
	
	public static void main(String[] args) throws IOException
	{   
		emp_age=new int[3];
		 Emplye_salary ad=new Emplye_salary();
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<emp_age.length;i++)
		{
		
			System.out.println("enter age of " +emp_name[i]+":");
		emp_age[i]=Integer.parseInt(br.readLine());
		}
	
	display();
	}
	    public static void  display()
	    {
	    	System.out.println("employe names");
	    	for(String ename:emp_name)
	    	{
	    		System.out.println(ename);
	    	
	    	}
	    	System.out.println("emp salries");
	    	for(float esalary:emp_sal)
	    	{
	    		System.out.println(esalary);
	    	}
	    	System.out.println("emp ages");
	    	for(float eage:emp_age)
	    	{
	    		System.out.println(eage);
	    	}
	    }
	    	
	    }


