package selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selinium 2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();             
		driver.get("http://www.automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validation point of title//
		
		if(title.equals("My Store")) {
			System.out.println("Correct Title");
		}
		
		else {
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.close();
		

	}

	

}
