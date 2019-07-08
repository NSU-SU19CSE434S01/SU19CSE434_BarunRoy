package application;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController implements EventHandler<ActionEvent> {
	
	@FXML
	public TextField name;
	
	@FXML
	public TextField address;
	@FXML
	public TextField mobile;
	@FXML
	public TextField email;
	@FXML
	public TextField dateofbirth;
	
	@FXML
	public TextField careerobjective;
	
	@FXML
	public TextField personalskills1;
	@FXML
	public TextField personalskills2;
	@FXML
	public TextField personalskills3;
	@FXML
	public TextField personalskills4;
	@FXML
	public TextField personalskills5;
	@FXML
	public TextField personalskills6;
	
	@FXML
	public TextField professionalskills1;
	@FXML
	public TextField professionalskills2;
	@FXML
	public TextField professionalskills3;
	@FXML
	public TextField professionalskills4;
	@FXML
	public TextField professionalskills5;
	@FXML
	public TextField professionalskills6;
	
	
	
	@FXML
	public Button Generate;
	
	@FXML
	String na,ad,mo,em,da,ca,pe1,pe2,pe3,pe4,pe5,pe6;
	
	public void press(ActionEvent args) {
		Generate.setOnAction(this);		
	}

	
	@Override
	public void handle(ActionEvent args) {
		// TODO Auto-generated method stub
				
		if(args.getSource()==Generate) {
			
			String na=name.getText();
			
			String ad=address.getText();
			String mo=mobile.getText();
			String em=email.getText();
			String da=dateofbirth.getText();
			
			String ca=careerobjective.getText();
			
			String pe1=personalskills1.getText();
			String pe2=personalskills2.getText();
			String pe3=personalskills3.getText();
			String pe4=personalskills4.getText();
			String pe5=personalskills5.getText();
			String pe6=personalskills6.getText();

			
			String filename="Resume Generator.html";
			
			try {
				PrintWriter outputStream = new PrintWriter(filename);
				outputStream.println("<!DOCTYPE html>\r\n" + 
						"<html lang=\"en\">\r\n" + 
						"<head>\r\n" + 
						"  <meta charset=\"UTF-8\">\r\n" + 
						"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
						"  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
						"  <link href=\"https://fonts.googleapis.com/css?family=Montserrat|Sanchez\" rel=\"stylesheet\">\r\n" + 
						"  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\r\n" + 
						"\r\n" + 
						"  <title>Resume Generated</title>\r\n" + 
						"\r\n" + 
						"  <style>\r\n" + 
						"    html {\r\n" + 
						"      background-color: #ebeced;\r\n" + 
						"      padding: 0 1em;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    body{\r\n" + 
						"      background-color: #fff;\r\n" + 
						"      margin: 1em auto;\r\n" + 
						"      max-width: 50em;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    p, ul {\r\n" + 
						"      font-family: 'Sanchez', serif;\r\n" + 
						"      font-size: 12px;\r\n" + 
						"      letter-spacing: 1px;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    a{  \r\n" + 
						"      text-decoration: none;\r\n" + 
						"      color: inherit;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    :root {\r\n" + 
						"      --yellowish: #eeb14f;\r\n" + 
						"      --dark-purple: #263547;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    .container {\r\n" + 
						"      display: flex;\r\n" + 
						"      flex-direction: column;\r\n" + 
						"    }\r\n" + 
						"    .header {\r\n" + 
						"      display: flex;\r\n" + 
						"      justify-content: flex-start;\r\n" + 
						"      align-items: center;\r\n" + 
						"      background-color: var(--dark-purple);\r\n" + 
						"      height: 150px;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    \r\n" + 
						"    img.avatar {\r\n" + 
						"    width: 130px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"  \r\n" + 
						"    .title-holder {\r\n" + 
						"      align-items: center;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    .name {\r\n" + 
						"      color: var(--yellowish);\r\n" + 
						"      font-family: 'Montserrat', serif;\r\n" + 
						"      text-transform: uppercase;\r\n" + 
						"      font-size: 36px;\r\n" + 
						"      font-weight: bold;\r\n" + 
						"      margin:20px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    \r\n" + 
						"    .content-body {\r\n" + 
						"      display: flex;\r\n" + 
						"      flex-direction: row;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    .wrapper {\r\n" + 
						"      margin: 20px;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    .section-left {\r\n" + 
						"      flex: 1;\r\n" + 
						"      background-color: var(--yellowish);\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    .section-left ul {\r\n" + 
						"      list-style: none;\r\n" + 
						"      margin-left: -40px;\r\n" + 
						"      text-transform: capitalize;\r\n" + 
						"      font-size: 12px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    h2 {\r\n" + 
						"      text-transform: uppercase;\r\n" + 
						"      font-size: 0.9em;\r\n" + 
						"      font-weight: bold;\r\n" + 
						"      font-family: 'Montserrat', serif;\r\n" + 
						"      letter-spacing: 2px;\r\n" + 
						"    }\r\n" + 
						"    \r\n" + 
						"    h3 {\r\n" + 
						"      text-transform: uppercase;\r\n" + 
						"      font-size: 0.7em;\r\n" + 
						"      font-family: 'Sanchez', serif;\r\n" + 
						"      font-weight: normal;\r\n" + 
						"      letter-spacing: 2px;\r\n" + 
						"    }\r\n" + 
						"    h4 {\r\n" + 
						"      font-family: 'Sanchez', serif;\r\n" + 
						"      font-weight: normal;\r\n" + 
						"      font-size: 0.8em;\r\n" + 
						"      margin-top: -10px;\r\n" + 
						"      font-style: italic;\r\n" + 
						"      letter-spacing: 1px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .section-right {\r\n" + 
						"      flex: 2;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .section-right .wrapper {\r\n" + 
						"      margin-left: 50px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .section-right ul {\r\n" + 
						"      margin-left: -20px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .section-right h2 {\r\n" + 
						"      color: var(--yellowish);\r\n" + 
						"      font-weight: bold;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .gpa {\r\n" + 
						"      margin-top: -15px;\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .footer {\r\n" + 
						"      background-color: var(--dark-purple);\r\n" + 
						"    }\r\n" + 
						"\r\n" + 
						"    .ps {\r\n" + 
						"      color: #ffffff; \r\n" + 
						"    }\r\n" + 
						"  </style>\r\n" + 
						"\r\n" + 
						"</head>\r\n" + 
						"\r\n" + 
						"<body>\r\n" + 
						"\r\n" + 
						"      \r\n" + 
						"  <div class=\"container\">\r\n" + 
						"  <div class=\"container\">\r\n" + 
						"    <div class=\"header\">\r\n" + 
						"      <div>\r\n" + 
						"        <div><img src=\"Photo.jpg\" alt=\"avatar\" class=\"avatar\"></div>\r\n" + 
						"      </div>\r\n" + 
						"      <div class=\"title-holder\">\r\n" + 
						"        <div class=\"name\">"+na+"</div>\r\n" + 
						"      </div>\r\n" + 
						"    </div> <!-- end header -->\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"    <div class=\"content-body\">\r\n" + 
						"      <div class=\"section-left\">\r\n" + 
						"        <div class=\"wrapper\">\r\n" + 
						"          <div class=\"lists\">\r\n" + 
						"            <h2>Personal Information</h2>\r\n" + 
						"            <ul>\r\n" + 
						"               <li> Address: "+ad+" </li>\r\n" + 
						"               <li> Mobile: "+mo+" </li>\r\n" + 
						"               <li> Email: "+em+" </li>\r\n" + 
						"               <li> Date of Birth: "+da+" </li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"lists\">\r\n" + 
						"            <h2>Personal Skills</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>"+pe1+"</li>\r\n" + 
						"              <li>"+pe2+"</li>\r\n" + 
						"              <li>"+pe3+"</li>\r\n" + 
						"              <li>"+pe4+"</li>\r\n" + 
						"              <li>"+pe5+"</li>\r\n" + 
						"              <li>"+pe6+"</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"lists\">\r\n" + 
						"            <h2>Professional Skills</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>SEO and Google analytics</li>\r\n" + 
						"              <li>social media strategy</li>\r\n" + 
						"              <li>marketing</li>\r\n" + 
						"              <li>web content developer</li>\r\n" + 
						"              <li>corporate blogging</li>\r\n" + 
						"              <li>photo editing</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"lists\">\r\n" + 
						"            <h2>Personal Assessment</h2>\r\n" + 
						"            <p>\r\n" + 
						"              I am very comfortable at working both in a group or individually and like to work in competitive environment with huge mental strength and good physic.\r\n" + 
						"            <p>\r\n" + 
						"          </div>\r\n" + 
						"        </div> <!-- end wrapper -->\r\n" + 
						"      </div> <!-- end section left -->\r\n" + 
						"\r\n" + 
						"             \r\n" + 
						"      \r\n" + 
						"      <div class=\"section-right\">\r\n" + 
						"        <div class=\"wrapper\">\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Career Objective</h2>\r\n" + 
						"            <p>"+ca+"</p>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Educatinal Qualification</h2>\r\n" + 
						"\r\n" + 
						"            <h3>Graduation Information</h3>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Major:</li>\r\n" + 
						"              <li>Institution:</li>\r\n" + 
						"              <li>Year of Graduation:</li>\r\n" + 
						"              <li>CGPA: on a scale of 4</li>\r\n" + 
						"            </ul>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"            <h3>A'Level/HSC Information</h3>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Institution:</li>\r\n" + 
						"              <li>Year of Graduation:</li>\r\n" + 
						"              <li>CGPA: on a scale of 5</li>\r\n" + 
						"            </ul>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"            <h3>O'Level/SSC Information</h3>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Institution:</li>\r\n" + 
						"              <li>Year of Graduation:</li>\r\n" + 
						"              <li>CGPA: on a scale of 5</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>work experience</h2>\r\n" + 
						"\r\n" + 
						"            <h3>social media producer</h3>\r\n" + 
						"            <h4>Red Media Company | Feb 2013 - Dec 2014</h4>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Managed social media accounts</li>\r\n" + 
						"              <li>Created social media graphics for daily postings</li>\r\n" + 
						"              <li>Increased social media following and clicks by 200%</li>\r\n" + 
						"            </ul>\r\n" + 
						"\r\n" + 
						"            <h3>communications intern</h3>\r\n" + 
						"            <h4>Red Media Interactive | Apr 2012 - Jan 2013</h4>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Developed a social media strategy to increase the following of the company website</li>\r\n" + 
						"              <li>Spearheaded a viral campaign for one of the company's new products</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Achievements</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Successful participant of Independence Day Quiz Competition 2009 by YWSS</li>\r\n" + 
						"              <li>Received 25% scholarship for 12 semesters from NSU</li>\r\n" + 
						"            </ul>   \r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Co-Extracurricular Activities</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Executive body member of MLIS Community Service Club</li>\r\n" + 
						"              <li>Senior member of MLIS Drama Club</li>\r\n" + 
						"              <li>Sub-Executive body member of NSU Computer and Engineering Club</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Computer Expertise</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Very good Knowledge over MS Office (MS Word, MS Excel, MS PowerPoint)</li>\r\n" + 
						"              <li>Good knowledge in Java, MySQL Database, HTML and CSS</li>\r\n" + 
						"              <li>Sound knowledge in Android Studio</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"        </div>\r\n" + 
						"      </div> <!-- end section right -->\r\n" + 
						"    </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"    <div class=\"footer\">\r\n" + 
						"      <p class=\"ps\">Copyright &copy; 2019, Barun Roy Resume</p>\r\n" + 
						"    </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"<div style=\"margin-top:500px;\"></div>\r\n" + 
						"  \r\n" + 
						"</body>\r\n" + 
						"</html>\r\n" + 
						"\r\n" + 
						"");
				
				outputStream.close();
				System.out.println("Generated");
				
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
		
			
					
			
			
		}
		
	}
	

}
