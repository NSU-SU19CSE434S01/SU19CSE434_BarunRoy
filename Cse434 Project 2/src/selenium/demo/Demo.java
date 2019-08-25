package selenium.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();             
		driver.get("http://www.automationpractice.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
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
		
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("roy.barun@northsouth.edu");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='id_gender' and @type='radio']"));
		
		for(int i=0;i<radio.size();i++)
		{
			WebElement local_radio = radio.get(i);
			
			String value = local_radio.getAttribute("value");
			
			System.out.println("Values from radio buttons are=====>>>>>"+value);
			
			if(value.equalsIgnoreCase("1"))
			{
				local_radio.click();
			}
			
			
		}
		
		
		 
		
		driver.findElement(By.cssSelector("#customer_firstname")).sendKeys("Barun");
		
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Roy");
		
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("BRBR12");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select select0 = new Select(driver.findElement(By.id("days")));
		select0.selectByVisibleText("1");
		
		Thread.sleep(2000);
		
		Select select2 = new Select(driver.findElement(By.id("months")));
		select2.selectByVisibleText("January");
		
		Thread.sleep(2000);
		
		Select select3 = new Select(driver.findElement(By.id("years")));
		select3.selectByVisibleText("2019");
		
        /*
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("XYZ");
		*/
		
		
		driver.findElement(By.id("company")).sendKeys("New Maitree");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("31,Lake,Circus,Kalabagan");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Butte");
		Thread.sleep(2000);
		
		Select select4 = new Select(driver.findElement(By.id("id_state")));
		select4.selectByVisibleText("Alabama");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("12055");
		Thread.sleep(2000);
		
		Select select5 = new Select(driver.findElement(By.id("id_country")));
		select5.selectByVisibleText("United States");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("01684919582");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("25,Barisal");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
		Thread.sleep(2000);
		
		
		
		
		driver.close();
		
		
		

	}

	

}
