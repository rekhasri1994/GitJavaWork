package alloppsconceptsAEIP;



import java.util.Random; 

public class Randam{ 
  
    public static void main(String args[]) 
    { 
    	
    	
    	int max=100;
    	int min=1;
               int showMe;
               Random rand = new Random();
               int showMe1=min + rand.nextInt(max-min);
               System.out.println(showMe1);
               
    		  
    		  System.out.println("Ceiling of '" + showMe1 + "' = " + Math.ceil(showMe1));

    		  System.out.println("Floor of '" + showMe1 + "' = " + Math.floor(showMe1));

    		  
    		 }
}
    	
    
     
        
