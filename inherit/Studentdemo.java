package inherit;

public class Studentdemo {
	public static void main(String[] args)

	{
		Student s1=new Student(1234,new StringBuilder("rekha"));
		/*s1.rollNumber=1234;
		s1.studentName.append("rekha");*/
		s1.brethe();
		s1.talk();
		s1.walk();
	}
}
