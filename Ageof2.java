package bootcamp1;

import java.util.Scanner;

class Ageof2
{
        public static void main(String[] args) 
        {
                int a;
                int b;
                int c;
                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                c=sc.nextInt();
                int max = (a>b ? (a>c ? a : c): (b>c ? b : c));
                System.out.println("oldest friend: " +max+ "years");
                int min = (a<b ? (a<c ? a : c): (b<c ? b : c));
                System.out.println("Youngest friend: " +min+ "years");
        }
}