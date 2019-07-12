package application;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
	
	/*Graduation Information*/
	
	@FXML
	public TextField major;
	@FXML
	public TextField institution1;
	@FXML
	public TextField yearofgraduation1;
	@FXML
	public TextField cgpa1;
	
	
	/*A'Level/HSC Information*/
	
	@FXML
	public TextField alevelorhsc;
	@FXML
	public TextField institution2;
	@FXML
	public TextField yearofgraduation2;
	@FXML
	public TextField cgpa2;
	
	
	/*O'Level/SSC Information*/
	
	@FXML
	public TextField olevelorssc;
	@FXML
	public TextField institution3;
	@FXML
	public TextField yearofgraduation3;
	@FXML
	public TextField cgpa3;
	
	/*Work Experience*/
	
	@FXML
	public TextField designation;
	@FXML
	public TextField companyname;
	@FXML
	public TextField workdone;
	
	
	/*Achievements*/
	
	@FXML
	public TextField achievements1;
	@FXML
	public TextField achievements2;
	
	
	/*CO-Extracurricular Activities*/
	
	@FXML
	public TextField coextracurricularactivities1 ;
	@FXML
	public TextField coextracurricularactivities2;
	
	
    /*Computer Expertise*/
	
	@FXML
	public TextField computerexpertise1;
	@FXML
	public TextField computerexpertise2;
	
	
    /*Personal Assessment*/
	
	@FXML
	public TextField personalassessment;
	
	
	
	
	
	
	@FXML
	public Button Generate;
	
	@FXML
	String na,ad,mo,em,da,ca,pe1,pe2,pe3,pe4,pe5,pe6,pr1,pr2,pr3,pr4,pr5,pr6,ma,in1,ye1,cg1,al,in2,ye2,cg2,ol,in3,ye3,cg3,de,co,wo,ac1,ac2,coe1,coe2,com1,com2,per;
	
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
			
			String pr1=professionalskills1.getText();
			String pr2=professionalskills2.getText();
			String pr3=professionalskills3.getText();
			String pr4=professionalskills4.getText();
			String pr5=professionalskills5.getText();
			String pr6=professionalskills6.getText();
			
			
			/*Graduation Information*/
			
			String ma=major.getText();
			String in1=institution1.getText();
			String ye1=yearofgraduation1.getText();
			String cg1=cgpa1.getText();
			
			/*A'Level/HSC Information*/
			
			String al=alevelorhsc.getText();
			String in2=institution2.getText();
			String ye2=yearofgraduation2.getText();
			String cg2=cgpa2.getText();
			
			/*O'Level/SSC Information*/
			
			String ol=olevelorssc.getText();
			String in3=institution3.getText();
			String ye3=yearofgraduation3.getText();
			String cg3=cgpa3.getText();
			
            
			/*Work Experience*/
			
			String de=designation.getText();
			String co=companyname.getText();
			String wo=workdone.getText();
			
			
            /*Achievements*/
			
			String ac1=achievements1.getText();
			String ac2=achievements2.getText();
			
            
			/*CO-Extracurricular Activities*/
			
			String coe1=coextracurricularactivities1.getText();
			String coe2=coextracurricularactivities2.getText();
			
			
            /*Computer Expertise*/
			
			String com1=computerexpertise1.getText();
			String com2=computerexpertise2.getText();
			
			
            /*Computer Expertise*/
			
			String per=personalassessment.getText();
			
			
			
			
			
			
			String filename="Resume Generator.html";
			
			Boolean bo = validateTextFields();
			
			if(bo.equals(true)){
				
			
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
						"              <li>"+pr1+"</li>\r\n" + 
						"              <li>"+pr2+"</li>\r\n" + 
						"              <li>"+pr3+"</li>\r\n" + 
						"              <li>"+pr4+"</li>\r\n" + 
						"              <li>"+pr5+"</li>\r\n" + 
						"              <li>"+pr6+"</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"lists\">\r\n" + 
						"            <h2>Personal Assessment</h2>\r\n" + 
						"            <p>\r\n" + 
						"              "+per+"\r\n" + 
						"            </p>\r\n" + 
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
						"              <li>Major: "+ma+"</li>\r\n" + 
						"              <li>Institution: "+in1+"</li>\r\n" + 
						"              <li>Year of Graduation: "+ye1+"</li>\r\n" + 
						"              <li>CGPA: "+cg1+" on a scale of 4</li>\r\n" + 
						"            </ul>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"            <h3>"+al+" Information</h3>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Institution: "+in2+" </li>\r\n" + 
						"              <li>Year of Graduation: "+ye2+" </li>\r\n" + 
						"              <li>CGPA: "+cg2+" on a scale of 5</li>\r\n" + 
						"            </ul>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"            <h3>"+ol+" Information</h3>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>Institution: "+in3+"</li>\r\n" + 
						"              <li>Year of Graduation: "+ye3+"</li>\r\n" + 
						"              <li>CGPA: "+cg3+" on a scale of 5</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>work experience</h2>\r\n" + 
						"\r\n" + 
						"            <h3>"+de+"</h3>\r\n" + 
						"            <h4>"+co+"</h4>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>"+wo+"</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Achievements</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>"+ac1+"</li>\r\n" + 
						"              <li>"+ac2+"</li>\r\n" + 
						"            </ul>   \r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Co-Extracurricular Activities</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>"+coe1+"</li>\r\n" +  
						"              <li>"+coe2+"</li>\r\n" + 
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"          <div class=\"content\">\r\n" + 
						"            <h2>Computer Expertise</h2>\r\n" + 
						"            <ul>\r\n" + 
						"              <li>"+com1+"</li>\r\n" + 
						"              <li>"+com2+"</li>\r\n" +  
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
						"\r\n" + 
						"");
				
				outputStream.close();
				System.out.println("Generated");
				
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			}
			
			else {
				System.out.println("Cannot be generated");
			}
			
					
		}
		
	}
	
	private boolean validateTextFields() {
		if(name.getText().isEmpty() || address.getText().isEmpty() || mobile.getText().isEmpty() || email.getText().isEmpty() || dateofbirth.getText().isEmpty()) {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Fields");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter into all the TextFields under Personal Information.");
			alert.showAndWait();
			
			return false;
							
		}
		
		return true;
	}
	

}
