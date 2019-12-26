package bootcamp3;
import java.util.Scanner;
public class Matrix {


public static void main(String[] args) 
{
int i,j;
Scanner sc = new Scanner(System.in); 

//reading rows and columns of matrix1
     int rows = sc.nextInt();  
 int columns = sc.nextInt();  
 int[][] array = new int[rows][columns];  

// Entering elements into the matrix1  
   for(i = 0; i < rows; i++)  
   {  
       for(j = 0; j < columns; j++)   
           {  
           array[i][j] = sc.nextInt();  
          // System.out.print(" ");  
           }  
   } 
   
   
//reading rows and columns of matrix2 
 int rows1 = sc.nextInt();  
 int columns1 = sc.nextInt(); 
 int array1[][] = new int[rows1][columns1]; 
 int array2[][] = new int[rows1][columns1]; 

// Entering elements into the matrix2 
   for(i = 0; i < rows; i++)  
   {  
       for(j = 0; j < columns; j++)   
           {  
           array1[i][j] = sc.nextInt();  
           System.out.print(" ");  
           }  
   }
   
   
transpose(array,rows,columns);   //it is static method so call the method directly no usage of object


// Multiplying Two matrices
   int[][] product = multiplyMatrices(array, array1, rows, columns, rows1,columns1);
   

   
   // Displaying the matrix multiplication
   Matrix dp=new Matrix();//creation of object for static class
  dp.displayProduct(product);//it is non static so call method using object of static class
}






static int[][] multiplyMatrices(int[][] array, int[][] array1, int rows, int columns,int rows1, int columns1) 
   {
    int[][] array2 = new int[rows][columns1];
   
    if(columns==rows1)
       {
       for (int i = 0; i < rows; i++)
       {
           for ( int j = 0; j < columns; j++)
           {
               for (int k = 0; k < columns; k++)
               {
                array2[i][j] = array2[i][j] + array[i][k] * array1[k][j];
               }
               
       }
       }
       }
    else
    {
    
    }
       return array2; 
   }
    

public void displayProduct(int[][] array2) 
   {
       System.out.println("Product of two matrices is: ");
       for(int[] row : array2) 
       {
           for (int column : row) 
           {
               System.out.print(column + "    ");
           }
           System.out.println();
       }
   }

public static void transpose(int[][] array, int rows,int columns)
{
System.out.println("The Transpose of 1st matrix is ");  
    for(int i = 0; i < rows; i++)  
    {  
        for( int j = 0; j < columns; j++)  
       {  
        System.out.print(array[j][i]+" ");  
       }  
       System.out.println(" ");   
       }  
   
   }  
}


