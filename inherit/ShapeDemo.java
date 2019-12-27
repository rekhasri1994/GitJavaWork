package inherit;

public class ShapeDemo 
{
	public static void main(String[] args)
	{
		//Shape s = new Shape(); can't create object for Shape class because it is an abstract class
		//
		Triangle t=new Triangle();
		//Triangle t=new Shape();
		t.base=2.5f;
		t.height=5.0f;
		t.shapeName="triangle";
		t.vertex=3;
		t.showshape();
		Shape s1=acceptobject(t);
		s1.calcArea();
		
		Circle c= new Circle();
		c.shapeName="circle";
		c.vertex=0;
		c.radius=2.5f;
		c.showshape();
		Shape s=acceptobject(c);
		s.calcArea();
		
	}
	public static Shape acceptobject(Shape s)
	{
	
	if(s instanceof Triangle)
	{
		System.out.println("Triangle passed as an object");
	}
	else if(s instanceof Circle)
	{
		System.out.println("Circle passed as an object");	
	}
	return s;	
	}
}
