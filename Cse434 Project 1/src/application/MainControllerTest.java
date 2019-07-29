package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainControllerTest {

	@Test
	public void testvalidatename() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatename("Shihab Ahmed");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidateaddress() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateaddress("32, Lake Circus,Kalabagan, Dhaka-1205");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatemobile() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatemobile("01684919588");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidateemail() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateemail("roybarun36@gmail.com");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateofbirth() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatedateofbirth("01/07/1996");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedatecareerobjective() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatecareerobjective("To work in a legal way");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	
	
	
	
	
	

}
