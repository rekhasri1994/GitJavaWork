package inheritenceeboxadditional;

import java.util.Scanner;

public class Main2 {

    
    public static void main(String[] args)
    {
		
		Scanner sc=new Scanner(System.in);
		HPVISACard2 hpvc=new HPVISACard2();
		VISACard2 vc=new VISACard2();
		 String c=null;
		   int ch=0;
		
		do {
	       System.out.println("Enter the holder name");
	       String holderName=sc.next();
	       System.out.println("Enter the CCV number");
	       String ccv=sc.next();
	       System.out.println("Enter the bill amount");
	       double amount=sc.nextDouble();
	       System.out.println("Mention the type of spending");
	       String purchaseType=sc.next();
	      System.out.println("Choose card type\n1.VISA card\r\n" + "2.HP VISA card");
		   ch=sc.nextInt();
		if(ch==1)
			 {
			  	   System.out.println("Holder name:"+holderName+"\nCCV:"+ccv);
			  	   System.out.println("Reward points:"+vc.computeRewardPoints(purchaseType, amount));
			  	   System.out.println("Do you want to continue?(Y/N)");
		    	   c=sc.next();   
			  }
	       
		else if(ch==2)
	       	   {
			         if(purchaseType.equals("Fuel"))
			          {
			         
	       		  System.out.println("Holder name:"+holderName+"\nCCV:"+ccv);
		    	  System.out.println("Reward points:"+hpvc.computeRewardPoints(purchaseType, amount));
		    	  System.out.println("Do you want to continue?(Y/N)");
		    	  c=sc.next();
		    	  if(c.equals("N")||c.equals("n"))
			    	   break;
		    	  }
		    	  
		    	     else {
		    		  
			        	 System.out.println("Holder name:"+holderName+"\nCCV:"+ccv);
					  	   System.out.println("Reward points:"+vc.computeRewardPoints(purchaseType, amount));
					  	   System.out.println("Do you want to continue?(Y/N)");
				    	   c=sc.next();
				    	   if(c.equals("N")||c.equals("n"))
				    	   break;
		    	     }  
		    	  
	       	   }
	
		else
		{
			System.out.println("Invalid Choice");
			System.out.println("Do you want to continue?(Y/N)");
			c=sc.next();
			if(c.equals("N")||c.equals("n"))
				break;
			
		}
		
		
	}
		while((ch>=2)||(c.equals("y")||c.equals("Y")));
		
}
}

	


    




    

