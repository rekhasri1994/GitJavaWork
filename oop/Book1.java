package oop;
import java.time.LocalDate;
public class Book1 {
        
		public int bookNumber;
		private boolean return_Status;
		private LocalDate borrowDate,returnedDate,ReturnableDate;
		private float amountPayable=0.0f;
		 
		public void borrowBook()
		{
			Date borrowedDate = LocalDate.now();
		}
	     public void retunBook()
	     {
	    	 returnedDate=LocalDate.now();
	    	 returnableDate = borrowedDate+7;
	    	 
	    	 if(returnedDate<=returnableDate)
	    	 {
	    		 returnStatus = true
	    				 
	    	 }
	    	 else
	    	 {
	    		 amountPayable=(returnedDate-returnableDate)=10;
	    	 }
	}	 

}
