package exersises;
//exception handling
//custom exception
class Myexception extends Exception
{   
	
	//constructor
     Myexception() 
    {
    	System.out.println("my exception created");
	}
    public Myexception handler()
    {
    	System.out.println("exception handled here");
    	return this;
    }
    
}
public class Addinfdemo {

	public static void main(String[] args) throws Myexception 
	{   
		
		int   a,b;
		Integer result;
	    if(args.length!=2)
	    {
	    	System.out.println("pls pass 2 numbers as arguments");
	    }else
	    {
	    	try
	        {
		a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
	    
        
        	result=a/b;
        	System.out.print(result);
        }
        catch(Exception e)
        {
			//e.printStackTrace();
        	//System.out.print("exception occured");
        	   throw new Myexception().handler();
        	
		}
        finally 
        {   
        	result=null;
        	System.out.println("result object set to null finally block executed");
        }
        
        
	  }
  
}
}