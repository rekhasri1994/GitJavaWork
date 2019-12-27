package methods2additions;
import java.util.Scanner;

public class Method2addi {

	public static void main(String[] args) 
	{
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the student name:");
       String sname=sc.nextLine();
       System.out.println("Enter the register number:");
       int regno=sc.nextInt();
       System.out.println("Enter the course id:");
       int id=sc.nextInt();
       System.out.println("Enter the course name:");
       String cname=sc.next();
       Student2addi s=new Student2addi(sname, id);
       s.display();
       Course2add c=new Course2add(id, cname);
       c.display();
       System.out.print(sname+ " is learning the " +cname+ " course");
       
	}

}
