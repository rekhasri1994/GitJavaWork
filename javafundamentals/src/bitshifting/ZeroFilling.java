package bitshifting;

public class ZeroFilling
{
     public static void main(String[] args)
     {
    	 int x=8;
    	 System.out.print("x="+x);
    	 x=x>>>2;
    	 System.out.println("after shifting 2 bit right and filling zeros,x="+x);
     }
}
