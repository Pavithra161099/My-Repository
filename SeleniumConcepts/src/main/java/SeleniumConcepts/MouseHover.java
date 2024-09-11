package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://www.flipkart.com/");
//		
//		driver.findElement(By.xpath("//span[.='✕']")).click();
//		WebElement ele = driver.findElement(By.xpath("//span[.='Login']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(ele);
		
//		driver.get("https://www.hackerrank.com/");
//		WebElement products = driver.findElement(By.xpath("(//div[@class='nav-item'])[4]"));
//		Actions action = new Actions(driver);
//		action.moveToElement(products);
//		driver.findElement(By.xpath("(//a[@href='https://www.hackerrank.com/solutions/skills-strategy/'])[1]")).click();
	
		
		
	}

}
