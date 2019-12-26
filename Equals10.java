package bootcamp2;
import java.io.*;
import java.util.*;
public class Equals10 {
    public static boolean areEqual(int x[], int y[])
    {
    int n = x.length;
        int m = y.length;
        if (n != m)
         return false;
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i = 0; i < n; i++)
            if (x[i] != y[i])
                return false;
        return true;
    }
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    int x[] = new int[5];
    for (int i = 0 ; i <x.length; i++ ) 
 		  {
 			  x[i]=sc.nextInt();
 			 
 		  }
   int y[] = new int[5];
   for (int j = 0 ; j <x.length; j++ ) 
   {
 			  y[j]=sc.nextInt();
 		  }
        if (areEqual(x,y))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}


