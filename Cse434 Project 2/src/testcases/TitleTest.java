package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		Thread.sleep(500);
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("roybarun36@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("testtest");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		Thread.sleep(1000);
	}
	
	
	
	
  @Test(priority=1)
  public void automationTitleTest() {
	    
	  String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"My account - My Store");
	
  }
  
  
  @Test(priority=2)
  public void automationlogoTest() {
	  boolean b = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
	  Assert.assertTrue(b);
	  
  }
  
  
  @Test(priority=3)
  public void signinTest() {
	  boolean c = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).isDisplayed();
	  Assert.assertTrue(c);
  }
  
  
  
  @Test(priority=4)
  public void addtocartTest() throws InterruptedException {
	  
	    Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		
		Thread.sleep(1000);
		
        Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();  //clicks on add to cart button//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();  //clicks on proceed to checkout button 1st time//
		
		Thread.sleep(2000);
		

		String extracted = driver.findElement(By.xpath("//*[@id=\"summary_products_quantity\"]")).getText();
		String pattern   = "1 Product";
		Assert.assertEquals(extracted,pattern);
	  
	  
  }
  
  
  
  
  @Test(priority=5)
  public void removefromcartTest() throws InterruptedException {
	  
	    Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		
		Thread.sleep(1000);
		
        Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();  //clicks on add to cart button//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();  //clicks on proceed to checkout button 1st time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"5_19_0_204834\"]/i")).click();
		
		Thread.sleep(2000);
		
		String extracted = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
		String pattern   = "Your shopping cart is empty.";
		Assert.assertEquals(extracted,pattern);
		
		
  }
  
  
  @Test(priority=6)
  public void productdeliveryaddressTest() throws InterruptedException {
	  
	    Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		
		Thread.sleep(1000);
		
        Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();  //clicks on add to cart button//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();  //clicks on proceed to checkout button 1st time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();          //clicks on proceed to checkout button 2nd time//
		
		Thread.sleep(2000);
		
		
		String extracted = driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[3]")).getText();
		String pattern   = "32,Lake,Circus,Kalabagan";
		Assert.assertEquals(extracted,pattern);
		
		
  }
  
  
  
  
  @Test(priority=7)
  public void productshippingTest() throws InterruptedException {
	  
	    Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		
		Thread.sleep(1000);
		
        Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();  //clicks on add to cart button//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();  //clicks on proceed to checkout button 1st time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();          //clicks on proceed to checkout button 2nd time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();          //clicks on proceed to checkout button 3rd time//
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		
		Thread.sleep(2000);
		
		
		String extracted = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/strong")).getText();
		String pattern   = "My carrier";
		Assert.assertEquals(extracted,pattern);
		
	}
  
  
  
  @Test(priority=8)
  public void productpaymentTest() throws InterruptedException {
	  
	    Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		
		Thread.sleep(1000);
		
        Actions action1 = new Actions(driver);
		
		action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();  //clicks on add to cart button//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();  //clicks on proceed to checkout button 1st time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();          //clicks on proceed to checkout button 2nd time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();          //clicks on proceed to checkout button 3rd time//
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();                        //clicks on proceed to checkout button 4th time//
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		
		Thread.sleep(2000);
		
		
		String extracted = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p[1]/strong")).getText();
		String pattern   = "You have chosen to pay by check. Here is a short summary of your order:";
		Assert.assertEquals(extracted,pattern);
		
		
		
  }

		
		

  
  
  
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
  

}
