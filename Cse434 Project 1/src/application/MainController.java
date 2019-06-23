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
	public Button Generate;
	
	@FXML
	String na,ad,mo,em,da;
	
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
			
			String filename="Resume Generator.html";
			
			try {
				PrintWriter outputStream = new PrintWriter(filename);
				outputStream.println("<!Doctype html>\r\n" + 
						"\r\n" + 
						"<html>\r\n" + 
						"\r\n" + 
						"<head>\r\n" + 
						"\r\n" + 
						"	                    <link href=\\\"https://fonts.googleapis.com/css?family=Nunito:200,600\\\" rel=\\\"stylesheet\\\">\r\n" + 
						"					    <link rel=\\\"stylesheet\\\" href=\\\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\\\"> \r\n" + 
						"					    <script src=\\\"https://code.jquery.com/jquery-3.3.1.slim.min.js\\\"></script> \r\n" + 
						"					    <script src=\\\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\\\"></script>\r\n" + 
						"					    <script src=\\\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\\\"></script>\r\n" + 
						"					    <link rel=\\\"stylesheet\\\" href=\\\"{{asset('css/all.css')}}\\\">\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"	<title>Resume Generator</title>\r\n" + 
						"\r\n" + 
						"</head>\r\n" + 
						"\r\n" + 
						"<body>\r\n" + 
						"\r\n" + 
						"	<div class=\"container\">\r\n" + 
						"		\r\n" + 
						"\r\n" + 
						"			<h2 id=\"name\">Name: "+na+"</h2>\r\n" + 
						"			<h3 id=\"address\">Address: "+ad+" </h3>\r\n" + 
						"			<h3 id=\"mobile\">Mobile: "+mo+"</h3>\r\n" + 
						"			<h3 id=\"email\">Email: "+em+"</h4>\r\n" + 
						"			<h3 id=\"dateofbirth\">Date of Birth: "+da+"</h5>\r\n" + 
						"		\r\n" + 
						"\r\n" + 
						"	</div>\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"</body>\r\n" + 
						"</html>\r\n"+""
						);
				
				outputStream.close();
				System.out.println("Generated");
				
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
		
			
					
			
			
		}
		
	}
	

}
