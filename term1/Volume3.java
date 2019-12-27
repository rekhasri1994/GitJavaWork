package term1;

import java.util.Scanner;

public class Volume3 {
   static int volume3(int p)
   {
	 int v1=p*p*p;//volume of cube
	 return v1;
	   
   }
   static double volume3(double h,double l,double w)
   {
	   double v2=2 * h*(l+w);//volume of cuboid
	   return v2;
   }
   
   public static void main(String rags[])
   {
	   Volume3 v3=new Volume3();//creating object
	   System.out.println("volume of cube:"+v3.volume3(6));//calling volume methods
	   System.out.println("volume of cuboid:"+v3.volume3(1.7,1.4,2.3));////calling volume methods
	  
	   
   }
}

