
import java.time.LocalDate;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) 
	{
		String year;
		Scanner sc=new Scanner(System.in);
		year=sc.nextLine();
		LocalDate Id=LocalDate.of(Integer.parseInt(year),1,1);
		
		String dayOfWeek=new String(Id.getDayOfWeek().toString().toLowerCase());
		dayOfWeek=dayOfWeek.replace(dayOfWeek.charAt(0),Character.toTitleCase(dayOfWeek.charAt(0)));
		System.out.print(dayOfWeek);
		

	}

}
