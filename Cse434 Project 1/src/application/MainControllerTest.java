package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainControllerTest {                                                                                         

	@Test                                                                                                                                                                                
	public void testvalidatename() {                                                             
		MainController controller = new MainController();                                             
		boolean actualValue = controller.validatename("Barun Roy");
		boolean expectedValue = true;                                                                                                
		assertEquals(expectedValue,actualValue);
		                                                                                                                                                            
	}
	
	//Input Space Partitioning  for testvalidatename//                                  
	
      //  1a) Whether the name is empty                                                          
	  //                                                                  
     //  -a1:true (Value = [])                                               
	 //                                                                                         
     //  -a2:false (Values = ["Barun Roy", "Maliha Alam"]  
	//
    //
	//  1b) Size of name 

   //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[Shihab])
	
	//  -b3: more than 1 (Values = ["Arefin Rafi", "Ahmed Jawad"]
	
	
	//  1c) Whether the name contains null entries             
                                                         
   //  -c1: true (Values=[null],[null,["Adnin"],[null])
		
   // -c2: false (Values = ["Arefin Rafi", "Ahmed Jawad"] 
	
	
                //Graph Coverage for validatename//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
		                                                                                                                                                        
                        //  Node Coverage= {1,2,3}
                      //  Edge Coverage= {(1,2),(1,3)}
	
	
	@Test                                                                                                                                                                                  
	public void testvalidateaddress() {
		MainController controller = new MainController();
		boolean actualValue = controller.validateaddress("32, Lake Circus,Kalabagan, Dhaka-1205");                                                     
		boolean expectedValue = true;                                                                 
		assertEquals(expectedValue,actualValue);                                                                                                       
		                                                                                              
	}	
	
	  
    //Input Space Partitioning  for testvalidateaddress// 
    
	// 2a) Whether the address is empty                                                                                                                 
	//
	//
	//   -a1:true (Value = [])                                                                                -
	//	                                                                
    //   -a2:false (Values = ["27,Dhanmondi", "10,Mirpur"]                                                                     
	//	                                                                                              
		
	//2b) Size of address                                                                                    
	
	
    //    -b1: 0 (Value=[])                                             
	                                                                
   //   -b2: 1 (Values=[Mirpur]) 
	
   //	-b3: more than 1 (Values = ["Lake Circus,Kalabagan"]
	                                                                                        
	
  // 2c) Whether the address contains null entries                                            
														
	
    //   -c1: true (Values=[null],[null,["Uttara"],[null]) 
	                                                                
   //    -c2: false (Values = ["Mirpur", "Mohammadpur"]
	
	
           //Graph Coverage for validateaddress//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
	                                                                                        
                        //  Node Coverage= {1,2,3}
                    //  Edge Coverage= {(1,2),(1,3)}
																									                                                                       
	
	@Test
	public void testvalidatemobile() {                                                              
		MainController controller = new MainController();
		boolean actualValue = controller.validatemobile("01684919588");                              
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);                                                     
		
	}
	
	
	//Input Space Partitioning  for testvalidatemobile//
	
    //  1a) Whether the mobile no. is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["01684919588", "01687129704"]  
	

	//  1b) Size of mobile no. 

 //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[01711536886])
	
	//  -b3: more than 1 (Values = ["01684919587", "01684913456"]
	
	
	//  1c) Whether the mobile no. contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["01714567876"],[null])
		
 // -c2: false (Values = ["01678956432", "01716789543"] 
	
	
         //Graph Coverage for validateamobile//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
                          //  Node Coverage= {1,2,3}
                      //  Edge Coverage= {(1,2),(1,3)}
	
	@Test
	public void testvalidateemail() {                                                                
		MainController controller = new MainController();
		boolean actualValue = controller.validateemail("roybarun36@gmail.com"); 					
		boolean expectedValue = true;										
		assertEquals(expectedValue,actualValue);													
		
	}
	
	//Input Space Partitioning  for testvalidateemail//
	
    //  1a) Whether the email is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["roybarun45@gmail.com", "maliha.alm@gmail.com"]  
	

	//  1b) Size of email 

 //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=["roybarun45@gmail.com"])
	
	//  -b3: more than 1 (Values = ["maliha.alm@gmail.com", "roybarun45@gmail.com"]
	
	
	//  1c) Whether the email contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["adnin.hasan89@northsouth.edu"],[null])
		
 // -c2: false (Values = ["roybarun45@gmail.com", "adnin.hasan89@northsouth.edu"]
	
	
                //Graph Coverage for validateemail//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
                        //  Node Coverage= {1,2,3}
                      //  Edge Coverage= {(1,2),(1,3)}
	
	@Test
	public void testvalidatedateofbirth() {															
		MainController controller = new MainController();
		boolean actualValue = controller.validatedateofbirth("01/07/1996");							
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);													
		
	}
	
	//Input Space Partitioning  for testvalidatedateofbirth//
	
    //  1a) Whether the dateofbirth is empty  
	
    //  -a1:true (Value = [])
	
    //  -a2:false (Values = ["12/08/1996", "14/08/1996"]  
	

	//  1b) Size of dateofbirth

    //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=["20/08/1996"])
	
	//  -b3: more than 1 (Values = ["12/10/1994", "12/12/2012"]
	
	
	//  1c) Whether the dateofbirth contains null entries             
                                                       
   //  -c1: true (Values=[null],[null,["05/06/1996"],[null])
		
   // -c2: false (Values = ["12/08/1990", "30/08/1994"]
	
	
             //Graph Coverage for validatedateofbirth//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
                     //  Node Coverage= {1,2,3}
                   //  Edge Coverage= {(1,2),(1,3)}
	

	@Test
	public void testvalidatedatecareerobjective() {													
		MainController controller = new MainController();
		boolean actualValue = controller.validatecareerobjective("To work in a legal way");			
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);													
		
	}
	
	//Input Space Partitioning  for testvalidatecareerobjective//
	
    //  1a) Whether the careerobjective is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["To work", "Not to work"]  
	

	//  1b) Size of careerobjective 

 //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[To work])
	
	//  -b3: more than 1 (Values = ["Properly", "Not to work"]
	
	
	//  1c) Whether the careerobjective contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["Not to work"],[null])
		
 // -c2: false (Values = ["Properly", "Not to work"]
	
	
               //Graph Coverage for validatecareerobjective//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
	                   //  Node Coverage= {1,2,3}
	                 //  Edge Coverage= {(1,2),(1,3)}
	
	
	
	
	@Test
	public void testvalidatedatemajor() {															
		MainController controller = new MainController();											
		boolean actualValue = controller.validatemajor("CSE");										
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);													
		
	}
	
//Input Space Partitioning  for testvalidatemajor//
	
    //  1a) Whether the major is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["CSE", "BBA"]  
	

	//  1b) Size of major 

 //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[ENV])
	
	//  -b3: more than 1 (Values = ["CSE", "EEE"]
	
	
	//  1c) Whether the major contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["ENV"],[null])
		
 // -c2: false (Values = ["EEE", "BBA"]
	
	
               //Graph Coverage for validatemajor//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
	                   //  Node Coverage= {1,2,3}
	                 //  Edge Coverage= {(1,2),(1,3)}
	
	
	
	
	
	@Test
	public void testvalidatedateinstitution1() {													
		MainController controller = new MainController();
		boolean actualValue = controller.validateinstitution1("North South University");			
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);													
		
	}
	
//Input Space Partitioning  for testvalidateinstitution1//
	
    //  1a) Whether the institution1 is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["NSU", "Brac"]  
	

	//  1b) Size of institution1

 //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[IUB])
	
	//  -b3: more than 1 (Values = ["NSU", "EWU"]
	
	
	//  1c) Whether the institution1 contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["AIUB"],[null])
		
 // -c2: false (Values = ["IUB", "NSU"]
	
	
               //Graph Coverage for validateinstitution1//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
	                   //  Node Coverage= {1,2,3}
	                 //  Edge Coverage= {(1,2),(1,3)}
	
	
	
	
	
	@Test
	public void testvalidatedateyearofgraduation1() {												
		MainController controller = new MainController();
		boolean actualValue = controller.validateyearofgraduation1("2019");							
		boolean expectedValue = true;
		assertEquals(expectedValue,actualValue);													
			
	}
	
//Input Space Partitioning  for testvalidateyearofgraduation1//
	
    //  1a) Whether the yearofgraduation1 is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["2015", "1996"]  
	

	//  1b) Size of yearofgraduation1

 //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[2019])
	
	//  -b3: more than 1 (Values = ["1996", "2018"]
	
	
	//  1c) Whether the yearofgraduation1 contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["2017"],[null])
		
 // -c2: false (Values = ["1997", "2017"]
	
	
               //Graph Coverage for validateyearofgraduation1//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
	                   //  Node Coverage= {1,2,3}
	                 //  Edge Coverage= {(1,2),(1,3)}
	
	
	
	
	
	@Test
	public void testvalidatedatecgpa1() {															
		MainController controller = new MainController();
		boolean actualValue = controller.validatecgpa1("3.75");										
		boolean expectedValue = true;														
		assertEquals(expectedValue,actualValue);													
		
	}
	
//Input Space Partitioning  for testvalidatecgpa1//
	
    //  1a) Whether the cgpa1 is empty  
	
   //  -a1:true (Value = [])
	
   //  -a2:false (Values = ["2.23", "3.35"]  
	

	//  1b) Size of cgpa1

   //   -b1: 0 (Value=[])
	
	//  -b2: 1 (Values=[4.00])
	
	//  -b3: more than 1 (Values = ["2.67", "3.39"]
	
	
	//  1c) Whether the cgpa1 contains null entries             
                                                       
 //  -c1: true (Values=[null],[null,["3.67"],[null])
		
 // -c2: false (Values = ["3.78", "3.89"]
	
	
               //Graph Coverage for validatecgpa1//
	
    //                                 (1) 
	//        if the pattern matches   / \  If the pattern does not match
    //        with the user input     /   \  with the user input
	//                              (2)   (3) 
		
	                   //  Node Coverage= {1,2,3}
	                 //  Edge Coverage= {(1,2),(1,3)}
	
	
	
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
