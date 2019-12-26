package codecamp1;
import java.util.Scanner;
import java.lang.Math;

class Square 
{
float side;
Square(float side){
this.side = side;
}
public void calcArea() {
float area = side*side;
System.out.println("Area of Square is: "+area);
}
public void calcPerimeter( ) {
float perimeter=4*side;
System.out.println("Perimeter of Square is: "+perimeter);
}
}

class Circle
{
float radius;
Circle(float radius){
this.radius=radius;
}
public void calcArea() {
float area =3.14f*radius*radius;
System.out.println("Area of Circle is: "+area); 
}
public void calcPerimeter() {
float perimeter=2*3.14f*radius;
System.out.println("perimeter of Circle is: "+perimeter);
}
}

class Pentagon
{
float side;
Pentagon(float side){
this.side = side;
}
public void calcArea() {
float area = (float)(Math.sqrt(5*(5 + 2*(Math.sqrt(5))))* side*side)/4;
System.out.println("Area of Pentagon is: "+area);
}

public void calcPerimeter( ) {
float perimeter=5*side;
System.out.println("Perimeter of Pentagon is: "+perimeter);
}
}
public abstract class Problem2 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
Circle cir = new Circle(0);
System.out.print("Enter radius of Circle: ");
cir.radius = scan.nextFloat();

Pentagon pt = new Pentagon(0);
System.out.print("Enter side of Pentagon: ");
pt.side = scan.nextFloat();

Square sq= new Square(0);
System.out.print("Enter side of Square: ");
sq.side = scan.nextFloat();
cir.calcArea();
cir.calcPerimeter();
pt.calcArea();
pt.calcPerimeter();
sq.calcArea();
sq.calcPerimeter();

}

}












