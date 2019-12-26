package bootcamp3;

public class Distance11 {
	 public int x;
	  public int y;
	  //Point()()
	  Distance11(int xcoord, int ycoord){
	      this.x = xcoord;
	      this.y = ycoord;
	  }
	  public int getX() {
	      return x;
	  }
	  public int getY() {
	      return y;
	  }    
	  public static int distance(Distance11 p1, Distance11 p2) {
	   int sx = p1.x - p2.x;
	   int sy = p1.y - p2.y;
	   return (int) Math.sqrt(sx * sx + sy * sy);
	  }
}
