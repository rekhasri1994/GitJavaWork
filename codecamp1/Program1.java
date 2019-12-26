package codecamp1;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

	
	  
	// A class to represent a student. 
	class Student 
	{ 
	    int grades; 
	    String fname, lname; 
	  
	    // Constructor 
	    public Student(int grades, String fname, 
	                               String lname) 
	    { 
	        this.grades = grades; 
	        this.fname = fname; 
	        this.lname = lname; 
	    } 
	  
	    // Used to print student details in main() 
	    public String toString() 
	    { 
	        return this.grades + " " + this.fname + 
	                           " " + this.lname; 
	    } 
	} 
	  
	class Grades implements Comparator<Student> 
	{ 
	    // Used for sorting in ascending order of 
	    
	    public int compare(Student a, Student b) 
	    { 
	        return a.grades - b.grades; 
	    } 
	} 
	  
	// Driver class 
	class Program1
	{ 
	    public static void main (String[] args) 
	    { 
	        Student [] arr = {new Student(02, "rekha", "sree"), 
	                          new Student(01, "sai", "kiran"), 
	                          new Student(03, "sree", "pujitha")}; 
	  
	        System.out.println("Unsorted"); 
	        for (int i=0; i<arr.length; i++) 
	            System.out.println(arr[i]); 
	  
	        Arrays.sort(arr, new Grades()); 
	  
	        System.out.println("\nSorted by grades"); 
	        for (int i=0; i<arr.length; i++) 
	            System.out.println(arr[i]); 
	    } 
	} 

