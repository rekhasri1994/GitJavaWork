package bootcamp2;

import java.util.Scanner;

public class Sortmain6 { public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

    Selctionsort6 ob = new Selctionsort6();
    int k = 6;
    int arr[] = new int[k];
    System.out.println("Input the array elements:");
    for(int i = 0; i < k; i++)
    {
        arr[i] = sc.nextInt();
    //{4,8,1,3,45,12};
    
}
   ob.sort(arr);
    
    System.out.println("Array elements after sorting:");
    ob.printArray(arr);
}
}




