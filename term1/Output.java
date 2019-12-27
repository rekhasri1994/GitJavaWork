package term1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Output
{
    public static void main(String[] args) 
    {

	Scanner scn = new Scanner(System.in);
    System.out.println("Enter the sentence do you want ");
    String input = scn.nextLine();
    System.out.println("the words are");
    Scanner tokenizer = new Scanner(input);
    tokenizer.useDelimiter(" ");
    ArrayList<Object> arr = new ArrayList<Object>();
    while(tokenizer.hasNext())
    {
        arr.add(tokenizer.next());
        System.out.println(arr.get(arr.size()-1));
    }
    
}
}