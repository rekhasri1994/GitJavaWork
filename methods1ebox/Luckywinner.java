
import java.util.Scanner;
class Luckywinner
{
    public static void main(String args[])
    {
        int num,lastdigit;
        
        Scanner sc=new Scanner(System.in);
    System.out.println("");
    num=sc.nextInt();
    lastdigit = num % 10;
if((lastdigit==8)||(lastdigit==3))
{
    System.out.println("Lucky Winner");
}
else
    {
    System.out.println("Not a Lucky Winner");
    }
}
}