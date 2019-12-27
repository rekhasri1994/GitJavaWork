import java.util.Scanner;
import java.text.DecimalFormat;
public class Main1 {


    public static void main(String[] args)
    {
       Customer1 c=new Customer1();
       SeniorCitizenCustomer1 s=new SeniorCitizenCustomer1();
        PrivilegeCustomer1 p = new PrivilegeCustomer1();
       
       Scanner sc=new Scanner(System.in);
       System.out.println("1)Privilege Customer\n2)SeniorCitizen Customer");
       
       System.out.println("Enter Customer Type");
       int choice=sc.nextInt();
       if(choice==1 || choice==2)
       {
       System.out.println("Enter The Name");
       String name=sc.next();
       c.setName(name);
       c.getName();
       
       System.out.println("Enter The Age");
       int age=sc.nextInt();
       c.setAge(age);
       c.getAge();
       
        System.out.println("Enter The Address");
        String address=sc.next();
        c.setAddress(address);
        c.getAddress();
        
       System.out.println("Enter The Mobile Number");
       String mobileNumber=sc.next();
       c.setMobileNumber(mobileNumber);
       c.getMobileNumber();
       
       System.out.println("Enter The Purchased Amount");
       double amount=sc.nextDouble();
       System.out.println("Bill Details");
       
       DecimalFormat df=new DecimalFormat("#.00");
       c.displayCustomer();
    
       
      
       if(choice==1)
       {
      
           System.out.println("Your bill amount is Rs "+amount+". Your bill amount is discount under privilege customer\nYou have to pay Rs "+df.format(p.generateBillAmount(amount)));
       }
       else if (choice==2)
       {
           System.out.println("Your bill amount is Rs "+amount+". Your bill amount is discount under senior citizen customer\nYou have to pay Rs "+df.format(s.generateBillAmount(amount)));
       }
       }
     else
            {
            System.out.println("Invalid Customer Type");
            } 
      
    
      
    }
}



