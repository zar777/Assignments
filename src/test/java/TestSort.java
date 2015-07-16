import static org.junit.Assert.*;
import org.junit.*;

public class TestSort {
	
		//initialize variable;
		CountingSort prova;
		int[] a = new int[7];
		
	   // assigning the values
		@Before public void setUp() throws Exception{
		  a[0] = 30;
		  a[1] = 20;
		  a[2] = 30;
		  a[3] = 30;
		  a[4] = 30;
		  a[5] = 20;
		  a[6] = 1;
		  prova = new CountingSort();
	   }

	   // test method to add two values
	   @Test public void sameLength(){
		   prova.countingAlgorithm(a);
	      assertTrue(prova.countingAlgorithm(a).size() == a.length);
	   }
	   // test method to add two values
	   @Test public void orderedList() {
		    
	        assertEquals(prova.countingAlgorithm(a).toString(), "[1, 20, 20, 30, 30, 30, 30]");
	        a[4] = 20;
	        prova.countingAlgorithm(a);
	        assertEquals(prova.countingAlgorithm(a).toString(), "[1, 20, 20, 20, 30, 30, 30]");
	       
	   }
	   @Test public void notNullList() {
		 
	       assertNotNull("array has been filled", prova.countingAlgorithm(a)); 
	    }
	  
	}
