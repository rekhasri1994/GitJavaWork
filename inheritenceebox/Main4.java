import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Icici4 ic=new Icici4();
		Hdfc4 hd=new Hdfc4();
		BankFactory4 bf=new BankFactory4();
		System.out.println("Welcome to Notification Setup\r\n" + "Please select your bank:\r\n" +"1)ICICI\r\n" + "2)HDFC"); 
		int choice=sc.nextInt();
        if(choice==1 || choice==2)
        {
        
        
         if(choice==1)
       {
  System.out.println("Enter the type of Notification you want to enter\r\n" + "1)SMS\r\n" + "2)Mail\r\n" + "3)Courier");
	  		
  		int choise=sc.nextInt();
  		switch(choise)
  		{
  		case 1:
  			bf.getIcici();
  			ic.notificationBySms();
  			break;
  		case 2:
  			bf.getIcici();
  			ic.notificationByEmail();
  			break;
  		case 3:
  			bf.getIcici();
  			ic.notificationByCourier();
  			break;
  			default:
  				System.out.print("Invalid Input");

  				
  		}
  		
  			
       }
        }
        if(choice==2)
        {
   System.out.println("Enter the type of Notification you want to enter\r\n" + "1)SMS\r\n" + "2)Mail\r\n" + "3)Courier");
 	  		
   		int choise=sc.nextInt();
   		switch(choise)
   		{
   		case 1:
   			bf.getHdfc();
   			hd.notificationBySms();
   			break;
   		case 2:
   			bf.getHdfc();
   			hd.notificationByEmail();
   			break;
   		case 3:
   			bf.getHdfc();
   			hd.notificationByCourier();
   			break;
   			default:
   				System.out.print("Invalid Input");

   				
   		}
   		
   			
        }
         }
	}
				
				
	
       

