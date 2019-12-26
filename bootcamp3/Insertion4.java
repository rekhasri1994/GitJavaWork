package bootcamp3;
import java.util.Scanner;
public class Insertion4 
{

   public static void main(String args[])
   {
       int size, insert, i, pos;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Elements : ");
       for(i=1; i<6; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       System.out.print("Enter Element to be Insert : ");
       insert = scan.nextInt();
       System.out.print("Input the position to insert: ");
       pos = scan.nextInt();
       
       // now create a space at the required position
       
       for(i=6; i>pos; i--)
       {
           arr[i] = arr[i-1];
       }
	   
       arr[pos] = insert;
       System.out.print("Array after insertion:\n");
       for(i=1; i<6+1; i++)
       {
           System.out.print(arr[i]+ " ");
       }
   }
}


