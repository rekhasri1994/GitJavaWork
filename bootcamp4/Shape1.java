package bootcamp4;


	public abstract class Shape1
	{
        abstract void numberofsides();

	    protected double area;
	     double perimeter;
	    public double getPerimeter()
	    {
	    	
	    	
			return perimeter;
	    	
	    }

	    public double getArea() {
	        return area;
	    }

	    protected abstract void onAreaChange();
	}


