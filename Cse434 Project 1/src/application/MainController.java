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
				outputStream.println("");
				
				outputStream.close();
				System.out.println("Generated");
				
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
		
			
					
			
			
		}
		
	}
	

}
