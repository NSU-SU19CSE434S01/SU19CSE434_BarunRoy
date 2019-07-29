package application;

import static org.junit.Assert.*;

import org.junit.Test;

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
		boolean actualValue = controller.validateaddress("32,Lake Circus,Kalabagan,Dhaka");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
