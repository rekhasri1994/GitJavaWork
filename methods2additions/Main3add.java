package methods2additions;
import java.util.Scanner;

public class Main3add {

	private static Staff3 staff;

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the staff:");
        String staffName=sc.nextLine();
        System.out.println("Enter the staff designation:");
        String desig=sc.nextLine();
        System.out.println("Enter the department name:");
        String deptName=sc.next();
        Staff3 s=new Staff3(staffName, desig);
        s.display();
        Department3addi d=new Department3addi(deptName, staff);
        d.display();
        System.out.println(staffName+" is working in the " +deptName+ " department as " +desig);

	}

}
