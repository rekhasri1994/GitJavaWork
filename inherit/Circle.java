package inherit;

public class Circle extends Shape {
	float radius,area;
	final static float PI=3.134f;
	//default constructor
	Circle(){
		System.out.println("Construction Circle object");
	}
	//overloaded constructor
	Circle(float radius){
		this.radius = radius;
	}
	public void calcArea() {
		area = PI*radius*radius;
		System.out.println("Area of circle is :"+area);
	}

}