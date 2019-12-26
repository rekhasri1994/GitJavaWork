package bootcamp3;
import java.util.*;
public class Program2

 {

    public static void main(String[] args) {

       Scanner inp = new Scanner(System.in);

       int i, j; // Variables declared..

       String str[];

       str = new String[5];

       int[][] mark = new int[5][]; // Array for name created

       System.out.println("Enter the scholar name :");

       for (i = 0; i < 5; i++) {

           str[i] = inp.nextLine();

       }

       System.out.println("Enter the marks of scholar :");// Array for marks

 

       mark[0] = new int[2];

       mark[1] = new int[3];

       mark[2] = new int[1];

       mark[3] = new int[5];

       mark[4] = new int[4];

 

       for (i = 0; i < mark.length; i++) {

           for (j = 0; j < mark[i].length; j++) {

               mark[i][j] = inp.nextInt();

 

           }

       }

       for (i = 0; i < mark.length; i++) {

           // System.out.println(str[i]+"\t");

           int sum = 0, avg = 0;

           for (j = 0; j < mark[i].length; j++) {

               // System.out.print(mark[i][j] +" ");

               sum = sum + mark[i][j]; // Sum calculation

               avg = sum / mark[i].length; // Avg calculation

           }

           System.out.println(str[i] + " : " + avg);

       }

       System.out.println();

 

    }

 

}
