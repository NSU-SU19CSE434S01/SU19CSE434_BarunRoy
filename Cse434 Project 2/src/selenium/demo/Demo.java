package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selinium 2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();             
		driver.get("http://www.automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
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
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("roybarun36@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		Thread.sleep(500);
		
		driver.close();
		
		
		

	}

	

}
