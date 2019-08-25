package selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyProduct {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
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
		
		driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_5_19_0_0\"]/span/i")).click();  //clicks on the icon-plus button//
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();  //clicks on proceed to checkout button 2nd time //
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("roybarun36@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("testtest");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		
		Thread.sleep(5000);
		
		
		driver.close();

	}
	
	

}
