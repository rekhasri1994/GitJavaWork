package codecamp1;
import java.util.ArrayList;
public class Sequential3 {
	

	
	    public static void main(String[] args) {
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        array.add(2);
	        array.add(7);
	        array.add(5);
	        array.add(2);
	        array.add(5);
	        array.add(3);
	        Integer key = 2;
	        boolean found = false;

	        // Search: note size() is used instead of length and get(i)
	        // is used instead of [i]. The method equals(key) must now be
	        // used because we are no longer dealing with primitive types.
	        for (int i = 0; i< array.size(); i++)
	            if (array.get(i).equals(key)) {
	                System.out.println("Key found at: " + (i + 1));
	                found = true;
	            }
	        if (!found)
	            System.out.println("Key not found");
	    }
	}


