package codecamp2;
import java.util.Scanner;
public class Maximun10 {

		public static void main(String args[])
		{
		    int i;
			int arr[]=new int[5];
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 5 elements");
			for(i=0; i<5; i++)
		       {
			     arr[i]=sc.nextInt();
			
		     }
			 int max = getMax(arr);
			   System.out.println("absolute maximum value is " +Math.abs(max));
		}

    public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
    if(inputArray[i] > maxValue){ 
       maxValue = inputArray[i]; 
    } 
  } 
  return maxValue;
}
}