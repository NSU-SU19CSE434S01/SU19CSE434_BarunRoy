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
	
	
	@Test
	public void testvalidatedatemajor() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatemajor("CSE");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateinstitution1() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateinstitution1("North South University");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateyearofgraduation1() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateyearofgraduation1("2019");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedatecgpa1() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatecgpa1("3.75");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedatealevelorhsc() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatealevelorhsc("A Level");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateinstitution2() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateinstitution2("Maple Leaf International School");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateyearofgraduation2() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateyearofgraduation2("2015");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedatecgpa2() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatecgpa2("4.75");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateolevelorssc() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateolevelorssc("O Level");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateinstitution3() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateinstitution3("Academia");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedateyearofgraduation3() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateyearofgraduation3("2013");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedatecgpa3() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatecgpa3("5.00");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	@Test
	public void testvalidatedatepersonalassessment() {
		MainController controller = new MainController();
		boolean actualValue = controller.validatepersonalassessment("To work honestly");
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
