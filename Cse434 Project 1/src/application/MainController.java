package application;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;




//import com.sun.prism.Image;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

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
	public DatePicker dateofbirth;
	
	
	@FXML
	public TextField careerobjective;
	
	@FXML
	public HBox nextpersonalskill[] = new HBox[20];
	 
	@FXML
	public VBox dyvbox1;
	
	
	
	
	@FXML
	public TextField textfield1[] = new TextField[20];
	public static String tex[]   = new String[20];
	
	
	
	
	
	int i=0;
	
	int last=0;
	
	int j=0;
	
	@FXML
	String fp,lp,mp,n,l;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	
	/*References*/
	
	
	@FXML
	public TextField name2;
	@FXML
	public TextField designation2;
	@FXML
	public TextField companyname2;
	@FXML
	public TextField email2;
	@FXML
	public TextField phone2;
	
	
	
	@FXML
	public Button Newpersonalskill;
	
	@FXML
	public Button Resumepicture;
	
	@FXML
	public ImageView Im;
	
	
	String a,b,c;
	
	
	
	
	
	
	
	
	
	@FXML
	public Button Generate;
	
	
	
	@FXML
	String na,ad,mo,em,da,ca,pr1,pr2,pr3,pr4,pr5,pr6,ma,in1,ye1,cg1,al,in2,ye2,cg2,ol,in3,ye3,cg3,de,co,wo,ac1,ac2,coe1,coe2,com1,com2,per,na2,de2,co2,em2,ph2;
	
	
	//To dynamically add TextFields for personal skills//
	
	public void newpersonalskill(ActionEvent args) {
		Newpersonalskill.setOnAction(this);
	}
	
	
	public void press(ActionEvent args) {
		Generate.setOnAction(this);
	}
	
	public void resumepicture(ActionEvent args) {
		Resumepicture.setOnAction(this);
	}
	
	
	
	
	@Override
	public void handle(ActionEvent args) {
		// TODO Auto-generated method stub
				
				
		if(args.getSource()==Generate) {
			
			String na=name.getText();
			
			String ad=address.getText();
			String mo=mobile.getText();
			String em=email.getText();
			String da=dateofbirth.getEditor().getText();
			
			String ca=careerobjective.getText();
			
		

			
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
			
			
            /*Personal assessment*/
			
			String per=personalassessment.getText();
			
			
            /*References*/
			
			
			String na2=name2.getText();
			String de2=designation2.getText();
			String co2=companyname2.getText();
			String em2=email2.getText();
			String ph2=phone2.getText();

			
			
			String filename="Resume Generator.html";
			
			
			
			Boolean bo1 = validatenameelse();
			
			Boolean bo2 = validateaddresselse();
			
			Boolean bo3 = validatemobileelse();
			
			Boolean bo4 = validateemail();
			
			Boolean bo5 = validatedateofbirth();
			
			Boolean bo6 = validatecareerobjective();
			
			Boolean bo7 = validatemajor();
			
			Boolean bo8 = validateinstitution1();
			
			Boolean bo9 = validateyearofgraduation1();
			
			Boolean bo10 = validatecgpa1();
			
			Boolean bo11 = validatealevelorhsc();
			
            Boolean bo12 = validateinstitution2();
			
			Boolean bo13 = validateyearofgraduation2();
			
			Boolean bo14 = validatecgpa2();
			
            Boolean bo15 = validateolevelorssc();
			
            Boolean bo16 = validateinstitution3();
			
			Boolean bo17 = validateyearofgraduation3();
			
			Boolean bo18 = validatecgpa3();
			
			Boolean bo19 = validatepersonalassessment();
			
			

			if(bo1.equals(true) & bo2.equals(true) & bo3.equals(true) & bo4.equals(true) & bo5.equals(true) & bo6.equals(true) & bo7.equals(true) & bo8.equals(true) & bo9.equals(true) & bo10.equals(true) & bo11.equals(true) & bo12.equals(true) & bo13.equals(true) & bo14.equals(true) & bo15.equals(true) & bo16.equals(true) & bo17.equals(true) & bo18.equals(true) &bo19.equals(true)){
				
			
			try {
				PrintWriter outputStream = new PrintWriter(filename);
				
		                String fp = ("<!DOCTYPE html>\r\n" + 
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
						"              <li>     </li>\r\n" + 
						"              <li>     </li>\r\n" + 
						"              <li>     </li>\r\n" + 
						"              <li>     </li>\r\n" + 
						"              <li>     </li>\r\n" + 
						"              <li>     </li>\r\n" +
						"              <li>     </li>\r\n" +
						"              <li>     </li>\r\n" +
						"            </ul>\r\n" + 
						"          </div>\r\n" + 
						"\r\n" + 
						"\r\n" );
						
						String lp="<div class=\"lists\">\r\n" + 
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
						"\r\n" +
						"\r\n" +
						"          <div class=\"lists\">\r\n" +
			            "            <h2>References</h2>\r\n" +
			            "            <ul>\r\n" +
			            "              <li>"+na2+"</li>\r\n" +
			            "              <li>"+de2+"</li>\r\n" +
			            "              <li>"+co2+"</li>\r\n" +
			            "              <li>"+em2+"</li>\r\n" + 
			            "              <li>"+ph2+"</li>\r\n" +
			            "           </ul>\r\n" +
			            "         </div>\r\n" +
			            
			            
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
						"\r\n";
						outputStream.println(fp+mp+lp);
		                
								                
		            
		                String mp=null,n;
		                for(i=0;i<last;i++) {
		                	n="<h1>" + textfield1[i].getText()+"<h1>";
		                	mp=mp+n;
		                	
		                }
		               
				
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
	
	
	
	public boolean validatename(String a) {
		Pattern p=Pattern.compile("([a-z A-Z]+)+");
		java.util.regex.Matcher m=p.matcher(a);
		if(m.find() && m.group().equals(a)) {
			return true;
		
		}
		
		else {
		
			return false;
		
		}
	}
	
	public boolean validatenameelse() {
		
		if (validatename(name.getText())==false) {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Name under Personal Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Name under Personal Information. It should contain only the First Name and the Last Name of your full name. Example: Barun Roy " );
			alert.showAndWait();
			return false;
			
		}
		
		else {
			
			return true;
		}
		
		
	}
	
	
	
	public boolean validateaddress(String b) {
		Pattern p=Pattern.compile("([0-9 a-z A-Z ,-]+)+");
		java.util.regex.Matcher m=p.matcher(b);
		if(m.find() && m.group().equals(b)) {
			return true;
		
		}else {
			
			return false;
		}
		
	}
	
    public boolean validateaddresselse() {
		
		if (validateaddress(address.getText())==false) {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Address under Personal Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Address under Personal Information. The Address should be in this format(Road Number, Name of your Area, Name of your City). Example: 32, Kalabgan, Dhaka-1205." );
			alert.showAndWait();
			
			return false;
			
		}
		
		else {
			
			return true;
		}
		
		
	}
	
	
	
    public boolean validatemobile(String c) {
		Pattern p=Pattern.compile("(88)?[0][0-9]{10}");
		java.util.regex.Matcher m=p.matcher(c);
		if(m.find() && m.group().equals(c)) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Mobile No. under Personal Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Mobile No. under Personal Information. The mobile no. should start with zero and contain exactly 11 digits(not more not less). Example: 01684919588" );
			alert.showAndWait();
			
			return false;
		}
		
	}
    
    
    public boolean validatemobileelse() {
		
		if (validateaddress(address.getText())==false) {
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Mobile No. under Personal Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Mobile No. under Personal Information. The mobile no. should start with zero and contain exactly 11 digits(not more not less). Example: 01684919588" );
			alert.showAndWait();
			
			return false;
		}
		
        else {
			
			return true;
		}
		
		
	}
    
    
    
    
	
	
	private boolean validateemail() {
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		java.util.regex.Matcher m=p.matcher(email.getText());
		if(m.find() && m.group().equals(email.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate E-mail under Personal Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid E-mail under Personal Information. Example: roybarun36@gmail.com. Please follow the format of Example and no space between alphabets or numbers" );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	
	private boolean validatedateofbirth() {
		Pattern p=Pattern.compile("[0-9/]+");
		java.util.regex.Matcher m=p.matcher(dateofbirth.getEditor().getText());
		if(m.find() && m.group().equals(dateofbirth.getEditor().getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Date of Birth under Personal Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Date of Birth under Personal Information. Please click the DatePicker and select your date and keep as it is or you can write as the format given in example. Example: 12/8/1996 " );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	
	private boolean validatecareerobjective() {
		Pattern p=Pattern.compile("([a-z A-Z]+)+");
		java.util.regex.Matcher m=p.matcher(careerobjective.getText());
		if(m.find() && m.group().equals(careerobjective.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Carer Objective");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Career Objective. It should only contain alphabetical words." );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	//Validation for graduation Information//
	
	
	private boolean validatemajor() {
		Pattern p=Pattern.compile("([a-z A-Z 0-9]+)+");
		java.util.regex.Matcher m=p.matcher(major.getText());
		if(m.find() && m.group().equals(major.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Major under Graduation Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Major under Graduation Information. It should only contain alphabetical words and numerical values" );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	private boolean validateinstitution1() {
		Pattern p=Pattern.compile("([a-z A-Z]+)+");
		java.util.regex.Matcher m=p.matcher(institution1.getText());
		if(m.find() && m.group().equals(institution1.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Instituion under Graduation Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Institution under Graduation Information. It should only contain alphabetical words." );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	
	private boolean validateyearofgraduation1() {
		Pattern p=Pattern.compile("([0-9]+)+");
		java.util.regex.Matcher m=p.matcher(yearofgraduation1.getText());
		if(m.find() && m.group().equals(yearofgraduation1.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Year of Graduation under Graduation Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Year of Graduation under Graduation Information. It should only contain numerical values" );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	
	private boolean validatecgpa1(){
		Pattern p=Pattern.compile("[0-9]+[.][0-9]+");
		java.util.regex.Matcher m=p.matcher(cgpa1.getText());
		if(m.find() && m.group().equals(cgpa1.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate CGPA under Graduation Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid CGPA under Graduation Information. It should contain a value to 2 decimal places" );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	
	//Validation for A'Level/SSC Information//
	
	
	private boolean validatealevelorhsc() {
		Pattern p=Pattern.compile("([a-z A-Z]+)+");
		java.util.regex.Matcher m=p.matcher(alevelorhsc.getText());
		if(m.find() && m.group().equals(alevelorhsc.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate A'Level or HSC under Graduation Information");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter either of the one A Level or HSC. It should only contain alphabetical words." );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	private boolean validateinstitution2() {
		Pattern p=Pattern.compile("([a-z A-Z]+)+");
		java.util.regex.Matcher m=p.matcher(institution2.getText());
		if(m.find() && m.group().equals(institution2.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Instituion under  A'Level or HSC Information ");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Institution under A'Level or HSC Information. It should only contain alphabetical words." );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	private boolean validateyearofgraduation2() {
		Pattern p=Pattern.compile("([0-9]+)+");
		java.util.regex.Matcher m=p.matcher(yearofgraduation2.getText());
		if(m.find() && m.group().equals(yearofgraduation2.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate Year of Graduation under  A'Level or HSC Information  ");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid Year of Graduation under A'Level or HSC Information. It should only contain numerical values" );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	private boolean validatecgpa2(){
		Pattern p=Pattern.compile("[0-9]+[.][0-9]+");
		java.util.regex.Matcher m=p.matcher(cgpa2.getText());
		if(m.find() && m.group().equals(cgpa2.getText())) {
			return true;
		
		}else {
			
			Alert alert=new Alert(AlertType.WARNING);
			alert.setTitle("Validate CGPA under A'Level or HSC Information ");
			alert.setHeaderText(null);
			alert.setContentText("Please Enter a Valid CGPA under A'Level or HSC Information . It should contain a value to 2 decimal places" );
			alert.showAndWait();
			
			return false;
		}
		
	}
	
	
	//Validation for A'Level/SSC Information//
	
	
		private boolean validateolevelorssc() {
			Pattern p=Pattern.compile("([a-z A-Z]+)+");
			java.util.regex.Matcher m=p.matcher(olevelorssc.getText());
			if(m.find() && m.group().equals(olevelorssc.getText())) {
				return true;
			
			}else {
				
				Alert alert=new Alert(AlertType.WARNING);
				alert.setTitle("Validate O'Level or SSC under Graduation Information");
				alert.setHeaderText(null);
				alert.setContentText("Please Enter either of the one O Level or SSC. It should only contain alphabetical words." );
				alert.showAndWait();
				
				return false;
			}
			
		}
		
		
		private boolean validateinstitution3() {
			Pattern p=Pattern.compile("([a-z A-Z]+)+");
			java.util.regex.Matcher m=p.matcher(institution3.getText());
			if(m.find() && m.group().equals(institution3.getText())) {
				return true;
			
			}else {
				
				Alert alert=new Alert(AlertType.WARNING);
				alert.setTitle("Validate Instituion under O'Level or SSC Information ");
				alert.setHeaderText(null);
				alert.setContentText("Please Enter a Valid Institution under O'Level or SSC Information. It should only contain alphabetical words." );
				alert.showAndWait();
				
				return false;
			}
			
		}
		
		
		private boolean validateyearofgraduation3() {
			Pattern p=Pattern.compile("([0-9]+)+");
			java.util.regex.Matcher m=p.matcher(yearofgraduation3.getText());
			if(m.find() && m.group().equals(yearofgraduation3.getText())) {
				return true;
			
			}else {
				
				Alert alert=new Alert(AlertType.WARNING);
				alert.setTitle("Validate Year of Graduation under  O'Level or SSC Information  ");
				alert.setHeaderText(null);
				alert.setContentText("Please Enter a Valid Year of Graduation under O'Level or SSC Information. It should only contain numerical values" );
				alert.showAndWait();
				
				return false;
			}
			
		}
		
		
		private boolean validatecgpa3(){
			Pattern p=Pattern.compile("[0-9]+[.][0-9]+");
			java.util.regex.Matcher m=p.matcher(cgpa3.getText());
			if(m.find() && m.group().equals(cgpa3.getText())) {
				return true;
			
			}else {
				
				Alert alert=new Alert(AlertType.WARNING);
				alert.setTitle("Validate CGPA under O'Level or HSC Information ");
				alert.setHeaderText(null);
				alert.setContentText("Please Enter a Valid CGPA under O'Level or SSC Information . It should contain a value to 2 decimal places" );
				alert.showAndWait();
				
				return false;
			}
			
		}
		
		
		private boolean validatepersonalassessment() {
			Pattern p=Pattern.compile("([a-z A-Z]+)+");
			java.util.regex.Matcher m=p.matcher(personalassessment.getText());
			if(m.find() && m.group().equals(personalassessment.getText())) {
				return true;
			
			}else {
				
				Alert alert=new Alert(AlertType.WARNING);
				alert.setTitle("Validate personalassessment");
				alert.setHeaderText(null);
				alert.setContentText("Please Enter a Valid Personal Assessment. It should only contain alphabetical words." );
				alert.showAndWait();
				
				return false;
			}
			
		}
	

	
	
	
	
	
	
	
	
	public void dynamic(ActionEvent args) {
		
		if(args.getSource()==Newpersonalskill) { 
		if(i<7) {
			
			
				
				textfield1[i] = new TextField();
				textfield1[i].getStyleClass().add("dy-text");
				
				textfield1[i].setPromptText("Add a skill");
				
				dyvbox1.getChildren().addAll(textfield1[i]);
				dyvbox1.setSpacing(20);
				
				i=i+1;
				last =i;
			}
			
			else { }
		
		}
		
	}
	
     public void choose_pic(ActionEvent args)throws IOException{
		
		FileChooser fc = new FileChooser();
	    File selectedFile = fc.showOpenDialog(null);
	    String working_dir = System.getProperty("user.dir");
	    
	    working_dir = working_dir+ "\\";
	    String path = selectedFile.getAbsolutePath();
	    
	    working_dir = working_dir.replace("\\", "\\\\");
	    
	    working_dir = working_dir+"Barun.png";
	    System.out.println(working_dir);
	    
	    try {
	    	FileInputStream in = new FileInputStream(path);
	    	FileOutputStream out = new FileOutputStream(working_dir);
	    	
	    	BufferedInputStream bin = new BufferedInputStream(in);
	    	BufferedOutputStream bout = new BufferedOutputStream(out);
	    	
	    	int b=0;
	    	while(b!= -1) {
	    		b= bin.read();
	    		bout.write(b);
	    	}
	    	
	    	bin.close();
	    	bout.close();
	    	
	    }
	    catch(FileNotFoundException e) {
	    	
	    	System.out.println("Failed to copy");
	    }
	    
	    File file1 = new File("barun.png");
	    Image image=new Image(file1.toURI().toString());
	    Im.setImage(image);
	    
	    
		
	}
	
	
	
	
	
	 
	
	
	
}
	

