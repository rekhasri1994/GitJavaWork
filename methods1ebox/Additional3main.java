
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Additional3main {
	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		String customerName,customerEmail,customerType;
		String street,city,country;
		int pincode;
		System.out.println("Enter the Customer Details");
		System.out.println("Enter the name");
		customerName = read.readLine();
		System.out.println("Enter the email");
		customerEmail = read.readLine();
		System.out.println("Enter the type");
		customerType = read.readLine();
		
		System.out.println("Enter Customer Address");
		System.out.println("Enter the street");
		street = read.readLine();
		System.out.println("Enter the city");
		city = read.readLine();
		System.out.println("Enter the pincode");
		pincode = Integer.parseInt(read.readLine());
		System.out.println("Enter the country");
		country = read.readLine();
		Address3addit address = new Address3addit(street,city,pincode,country);
		Customer3addti cust = new  Customer3addti(customerName,customerEmail,customerType,address);
		cust.displayDetails();
	}
}
