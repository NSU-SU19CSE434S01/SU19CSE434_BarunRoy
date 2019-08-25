package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selinium 2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.com/");
	}
	
	
	
  @Test
  public void automationTitleTest() {
	    
	  String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"My Store");
	
  }
  
  /*
  public void automationlogoTest() {
	  boolean b = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
	  
  }
  */
  
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
  

}
