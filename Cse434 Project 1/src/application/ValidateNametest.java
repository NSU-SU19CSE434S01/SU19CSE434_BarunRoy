package application;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class ValidateNametest {

	@Test
	void validatenametest() {
		MainController junit = new MainController();
		String result = junit.validatename("Barun");
		assertTrue(result);
		
	}
	
	
	

		@Test
		void validateaddresstest() {
			MainController junit = new MainController();
			String result = junit.validateaddress("32, Lake, Kalabagan");
			assertTrue(result);
			
		}
		
	
	

}
 