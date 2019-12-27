
import java.util.Scanner;
public class Stringsaddition1 { 
public static void main(String args[]) 
    { 
        Scanner scan=new Scanner(System.in);
  
        System.out.println("Enter the string");
        String str1 =scan.nextLine();
  
        // Testing the prefix using startsWith() 
        System.out.println("Enter the start string");
        String str2=scan.nextLine();
        if(str1.startsWith(str2))
        
            
        System.out.println("\""+str1+"\"" +" starts with "+"\""+str2+"\"");
  
        else
        {
        System.out.print("\""+str1+"\"" +" does not start with "+"\""+str2+"\""); 
         
    
        
    }
}
}