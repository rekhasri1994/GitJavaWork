
import java.util.Scanner;
public class Mainhall {
    public static void main(String args[]) throws Exception{
  //write your copde here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the stall category:");
        String name = sc.nextLine();
        System.out.println("Enter the details of the stall category:");
        String detail = sc.nextLine();
        StallCategory sc1= new StallCategory();
        System.out.println("Name:"+name+"\nDetail:"+detail);
        StallCategory sc2= new StallCategory(name,detail);
        
}
}