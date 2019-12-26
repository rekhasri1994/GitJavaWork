package bootcamp4;

//An immutable class 
 final class Student1 
{ 
final String name; 
final int regNo; 

public Student1(String name, int regNo) 
{ 
this.name = name; 
this.regNo = regNo; 
} 
public String getName() 
{ 
return name; 
} 
public int getRegNo() 
{ 
return regNo; 
} 
} 

//Driver class 
class Immutable5
{ 
public static void main(String args[]) 
{ 
Student1 s = new Student1("rekha", 72); 
System.out.println(s.getName()); 
System.out.println(s.getRegNo()); 

//Uncommenting below line causes error 
//s.regNo = 102; 
} 
} 

