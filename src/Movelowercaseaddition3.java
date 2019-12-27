import java.util.Scanner;
public class Movelowercaseaddition3 {
	

		    public static void main(String[] args) {
			
			Scanner Sca= new Scanner(System.in);
			
	        System.out.println("Enter the string");
	        String str1= Sca.nextLine();
	        int count=0;
	        
	        System.out.print("The processed string is ");
	        char ack[] = str1.toCharArray();
	        for(int i = 0; i < ack.length; i++)
	        {
	           if(ack[i] == 'x')
	           {
	        	   count++;
	        	   continue;
	        	   
	           }
	           System.out.print(ack[i]);
	        }
	        while(count>0)
	        {
	        System.out.print('x');
	        count--;
	        }
		}}     
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

