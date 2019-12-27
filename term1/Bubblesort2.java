package term1;

import java.util.Scanner;

public class Bubblesort2 {

	void bubbleSort(int arr[])//sorting method
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		

	}
	void printArray(int arr[])//printing array
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
		System.out.println(arr[i]+" ");
		System.out.println();
		
	}
   public static void main(String args[])
   {
	   Bubblesort2 bs=new Bubblesort2();//creating object
	   Scanner sc=new Scanner(System.in);
	   int[] arr=new int[10];
	   System.out.println("enter array elements");//taking inputs into array
	   for(int i=0;i<10;i++)
	   {
		  arr[i]=sc.nextInt(); 
	   }
	   bs.bubbleSort(arr);
	   System.out.println("sorted array");
	   bs.printArray(arr);
	   
	   
   }
}
