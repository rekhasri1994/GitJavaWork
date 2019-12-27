import java.util.Scanner;
public class Conversions {

public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the binary number");
 String b=sc.next();
          int bnum= Integer.parseInt(b,2);
          System.out.println("Enter the octal number");
          String o=sc.next();
          int onum =Integer.parseInt(o,8);
          System.out.println("Enter the hexadecimal number");
          String h=sc.next();
          int hnum =Integer.parseInt(h,16);
         System.out.println("The integer value of the binary number "+b +" is " +bnum ); 
         System.out.println("The integer value of the octal number "+o +" is " +onum );
        System.out.println("The integer value of the hexadecimal number "+h +" is " +hnum );    
        
}

}