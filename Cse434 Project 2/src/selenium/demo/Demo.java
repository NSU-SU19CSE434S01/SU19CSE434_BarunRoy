package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		
		
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Barun");
		
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Roy");
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("BRBR12");
		
		
		//handle drop box
		Select select1 = new Select(driver.findElement(By.id("days")));
		select1.selectByVisibleText("12");
		
		Select select2 = new Select(driver.findElement(By.id("months")));
		select2.selectByVisibleText("August");
		
		Select select3 = new Select(driver.findElement(By.id("years")));
		select3.selectByVisibleText("1996");
		
        
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("32,Lake Circus,Kalabagan");
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dhaka");
		
		
		Select select4 = new Select(driver.findElement(By.id("id_state")));
		select4.selectByVisibleText("New York");
		
		
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("1205");
		
		
		Select select5 = new Select(driver.findElement(By.id("id_country")));
		select5.selectByVisibleText("United States");
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("01684919588");
		
		
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("25,Khulna");
		
		
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		Thread.sleep(1000);
		
		
		driver.close();
		
		
		

	}

	

}
