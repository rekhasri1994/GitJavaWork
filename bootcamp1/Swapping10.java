package bootcamp1;
import java.util.Scanner;
public class Swapping10 

{
    public static void main(String args[])
    {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two integers:");
        num1 = scanner.nextInt();
        
        num2 = scanner.nextInt();
        System.out.println("Pre swapping:"+num1+" "+num2);
        
        num1 = num1 ^ num2;
        
        num2 = num1 ^ num2;
        
        num1 = num1 ^ num2;
        
        System.out.println("Post swapping:"+num1+" " +num2);
       
    }
}