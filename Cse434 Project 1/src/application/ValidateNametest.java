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
		
		//Test for Graduation Information//
		
		@Test
		void validatemajortest() {
			MainController junit = new MainController();
			String result = junit.validatemajor("CSE");
			assertTrue(result);
			
		}
		
		
		@Test
		void validateinstitution1test() {
			MainController junit = new MainController();
			String result = junit.validateinstitution1("NSU");
			assertTrue(result);
			
		}
		
		
		@Test
		void validateyearofgraduation1test() {
			MainController junit = new MainController();
			String result = junit.validateyearofgraduation1("2019");
			assertTrue(result);
			
		}
		
		
		@Test
		void validatecgpa1test() {
			MainController junit = new MainController();
			String result = junit.validatecgpa1("3.34");
			assertTrue(result);
			
		}
		
		
		//Test for A'Level or HSC Information//
		
				@Test
				void validatealevelorhsctest() {
					MainController junit = new MainController();
					String result = junit.validatealevelorhsc("A Level");
					assertTrue(result);
					
				}
				
				
				@Test
				void validateinstitution2test() {
					MainController junit = new MainController();
					String result = junit.validateinstitution2("MLIS");
					assertTrue(result);
					
				}
				
				
				@Test
				void validateyearofgraduation2test() {
					MainController junit = new MainController();
					String result = junit.validateyearofgraduation1("2015");
					assertTrue(result);
					
				}
				
				
				@Test
				void validatecgpa2test() {
					MainController junit = new MainController();
					String result = junit.validatecgpa1("4.67");
					assertTrue(result);
					
				}
				
				
				//Test for O'Level or SSC Information//
				
				@Test
				void validateolevelorssctest() {
					MainController junit = new MainController();
					String result = junit.validateolevelorssc("O Level");
					assertTrue(result);
					
				}
				
				
				@Test
				void validateinstitution3test() {
					MainController junit = new MainController();
					String result = junit.validateinstitution3("MasterMind");
					assertTrue(result);
					
				}
				
				
				@Test
				void validateyearofgraduation3test() {
					MainController junit = new MainController();
					String result = junit.validateyearofgraduation3("2015");
					assertTrue(result);
					
				}
				
				
				@Test
				void validatecgpa3test() {
					MainController junit = new MainController();
					String result = junit.validatecgpa3("4.67");
					assertTrue(result);
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
 