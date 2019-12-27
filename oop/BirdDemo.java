package oop;

public class BirdDemo {

	public static void main(String[] args) 
	{
		Bird p=new Bird();
		//set values to attributes
		p.birdColor="green";
		p.birdName="parrot";
		/*p.legs=2;
		p.wings=2;*/
		
	    p.walk();
	    p.setsingingStatus();
	    p.sing();
	    p.fly();
	    
	    Bird k=new Bird();
	    k.birdColor="black";
	    k.birdName="kokila";
	    k.walk();
	    k.setsingingStatus();
	    k.sing();
	    k.fly();
		System.out.print("object id:"+p.hashCode());
		

	}

}
