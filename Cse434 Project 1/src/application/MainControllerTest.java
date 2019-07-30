package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainControllerTest {                                                                     //Input Space Partitioning//                    

	@Test                                                                                             // 1a) Whether the name is empty                              1b) Size of name                                            1c) Whether the name contains null entries             
	public void testvalidatename() {                                                             
		MainController controller = new MainController();                                             //   -a1:true (Value = [])                                  -b1: 0 (Value=[])                                                -c1: true (Values=[null],[null,["Adnin"],[null])
		boolean actualValue = controller.validatename("Barun Roy");
		boolean expectedValue = true;                                                                 //   -a2:false (Values = ["Barun Roy", "Maliha Alam"]      -b2: 1 (Values=[Shihab])                                          -c2: false (Values = ["Arefin Rafi", "Ahmed Jawad"]                                  
		assertEquals(expectedValue,actualValue);
		                                                                                              //                                                          -b3: more than 1 (Values = ["Arefin Rafi", "Ahmed Jawad"]    
	}
	
	
	@Test                                                                                             // 2a) Whether the address is empty                              2b) Size of address                                        2c) Whether the address contains null entries                                            
	public void testvalidateaddress() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateaddress("32, Lake Circus,Kalabagan, Dhaka-1205");    //   -a1:true (Value = [])                                      -b1: 0 (Value=[])                                            -c1: true (Values=[null],[null,["Uttara"],[null]) 
		boolean expectedValue = true;                                                                 
		assertEquals(expectedValue,actualValue);                                                      //   -a2:false (Values = ["27,Dhanmondi", "10,Mirpur"]          -b2: 1 (Values=[Mirpur])                                     -c2: false (Values = ["Mirpur", "Mohammadpur"]                       
		                                                                                              
	}                                                                                                 //                                                              -b3: more than 1 (Values = ["Lake Circus,Kalabagan"]           
	
	
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
