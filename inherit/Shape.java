package inherit;

public abstract class Shape 
{
	//instance variables or properties or characteristics or attributes or fields
	public String shapeName;
	public int vertex;
	//abstract method
	public abstract void calcArea();
	//concrete method
	public void showshape()
	{
		System.out.println("shape:"+shapeName);
		System.out.println("vertex:"+vertex);
	}
}
	


