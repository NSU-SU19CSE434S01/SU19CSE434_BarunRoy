package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selinium 2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();             
		driver.get("http://www.automationpractice.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		Thread.sleep(500);

		driver.findElement(By.cssSelector("#id_contact")).sendKeys("Customer Service");
		Thread.sleep(4000);
		
		driver.close();

	}

}
