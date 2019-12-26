

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedHashSet;
	import java.util.List;
import java.util.Scanner;
	public class Split {
	 public static void main(String[] args) {
	  List l=new ArrayList();
	  Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the sentence do you want ");
	  String str=scn.nextLine();
	 String words[]= str.split(" ");
	 for(int i=0;i<words.length;i++)
	 {
	 l.add(words[i]);
	 }
	  Iterator i = l.iterator();
	  while(i.hasNext())
	  {
	   System.out.println(i.next());
	  }
	  LinkedHashSet hashSet = new LinkedHashSet(l);
	  
	  List al = new ArrayList(hashSet);
	  
	  System.out.println("unique words are"+al);
	  
	 }
	}

