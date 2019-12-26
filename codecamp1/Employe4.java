package codecamp1;

import java.util.Scanner;


	 
	 public class Employe4{
	     void sort(int array[])
	     {
	         int num = array.length;
	         
	         for (int i = 0; i < num-1; i++)
	         {
	             int minofindex = i;
	             for (int j = i+1; j < num; j++)
	             {
	             if (array[j] > array[minofindex])
	                 minofindex = j;
	             
	             }
	             int temp = array[minofindex];
	             array[minofindex] = array[i];
	             array[i] = temp;
	         }
	     }
	     public void display(int arr[])
	     {
	         int n = arr.length;
	         for (int i=0; i<n; ++i)
	             System.out.print(arr[i]+" ");
	         System.out.println();
	     }
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         Employe4 ob = new Employe4();
	 System.out.println("Number of employee id's you need to enter: ");
	         int k =sc.nextInt();
	         int array[] = new int[k];
	         System.out.println("Input Employee Id:");
	         for(int i = 0; i < k; i++)
	         {
	         array[i] = sc.nextInt();
	         }
	        ob.sort(array);
	 System.out.println("EmployeeId List after sorting:");
	         ob.display(array);
	     }
	 }

