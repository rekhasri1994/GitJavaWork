package codecamp1;
class Student1 
{ 
    int grades; 
    String fname, lname; 
  
    // Constructor 
    public Student1(int grades, String fname, 
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
  


