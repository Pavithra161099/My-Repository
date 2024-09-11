package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/edit");

		// isDisplayed()
		System.out.println(driver.findElement(By.linkText("Sign up")).isDisplayed());
		System.out.println("==============================================================");

		// isEnabled()
		System.out.println(driver.findElement(By.id("noEdit")).isEnabled());
		System.out.println(driver.findElement(By.id("dontwrite")).isEnabled());
		System.out.println("==============================================================");

		// isSelected()
		driver.get("https://letcode.in/radio");
		System.out.println(driver.findElement(By.xpath("(//label[@class='checkbox']//input)[1]")).isSelected());
		System.out.println(driver.findElement(By.id("notfoo")).isSelected());
		System.out.println(driver.findElement(By.id("going")).isSelected());
		
		driver.quit();
	}

}
