package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninAlreadyRegistered {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selinium 2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();             
		driver.get("http://www.automationpractice.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("test");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		Thread.sleep(4000);
		
		
		driver.close();

	}

}
