package inherit;

public class Bike implements Cycle,Automobile
{
      public boolean selfdriven() {
    	  return true;
      }
      public void balance() {
    	  System.out.println("we should balnce");
      }
}
