package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Contactus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();             
		driver.get("http://www.automationpractice.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		Thread.sleep(500);
        
		
		//handle drop box
		Select select = new Select(driver.findElement(By.id("id_contact")));
		select.selectByVisibleText("Customer service");
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("roybarun36@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"id_order\"]")).sendKeys("order15");
		
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Average Service");
		
		driver.findElement(By.xpath("//*[@id=\"fileUpload\"]")).sendKeys("F:\\Test Selenium\\Assignment Cover Page.docx");   //Uploads file from the Operating System//
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"submitMessage\"]/span")).click();
		
	
		driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a/i")).click();     //By clicking this button it returns to the home page//
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
