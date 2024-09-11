package ecommorce.shop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends MobileBrowserTestBaseClass{
	
	@Test
	public void browserTest() throws InterruptedException {
		
//		driver.get("http://google.com");
//		System.out.println(driver.getTitle());
//		driver.findElement(By.name("q")).sendKeys("Rahul shetty academy");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)", "");
		String text = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
		Assert.assertEquals(text, "Devops");
		System.out.println("hello world!");
		
		
		
		
		
		Thread.sleep(2000);
		
	}

}
