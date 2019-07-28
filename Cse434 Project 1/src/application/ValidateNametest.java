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
		
		@Test
		void validatemobiletest() {
			MainController junit = new MainController();
			String result = junit.validatemobile("01684919588");
			assertTrue(result);
			
		}
		
		
		@Test
		void validateemailtest() {
			MainController junit = new MainController();
			String result = junit.validateemail("roybarun36@gmail.com");
			assertTrue(result);
			
		}
		
		
		@Test
		void validatedateofbirthtest() {
			MainController junit = new MainController();
			String result = junit.validatedateofbirth("12/08/1996");
			assertTrue(result);
			
		}
		
		
		@Test
		void validatecareerobjectivetest() {
			MainController junit = new MainController();
			String result = junit.validatecareerobjective(" To work");
			assertTrue(result);
			
		}
		
		
		@Test
		void validatemajortest() {
			MainController junit = new MainController();
			String result = junit.validatemajor("CSE");
			assertTrue(result);
			
		}
		
		
		@Test
		void validateinstitution1test() {
			MainController junit = new MainController();
			String result = junit.validateinstitution1("32, Lake, Kalabagan");
			assertTrue(result);
			
		}
		
		
		@Test
		void validateyearofgraduation1test() {
			MainController junit = new MainController();
			String result = junit.validateyearofgraduation1("32, Lake, Kalabagan");
			assertTrue(result);
			
		}
		
		
		@Test
		void validatecgpa1test() {
			MainController junit = new MainController();
			String result = junit.validatecgpa1("32, Lake, Kalabagan");
			assertTrue(result);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
 