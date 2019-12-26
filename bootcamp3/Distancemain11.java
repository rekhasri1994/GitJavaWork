package bootcamp3;

public class Distancemain11 {
	public static void main(String str[]){

		int x = 0;
		int y = 0;

		   Distance11 p1 = new Distance11(-1,1);
		   Distance11 p2 = new Distance11(3,4);
		   Distance11 mp = new Distance11(x,y);

		       x = (p1.getX() + p2.getX()) / 2;
		       y = (p1.getY() + p2.getY()) / 2;
		       System.out.print(""+Distance11.distance(p1, p2));
		   }

		}



