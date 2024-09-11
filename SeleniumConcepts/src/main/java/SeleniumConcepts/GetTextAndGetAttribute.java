package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/edit");

		// get text
		WebElement header = driver.findElement(By.tagName("h1"));
		System.out.println("The header is: " + header.getText());

		WebElement cardContent = driver.findElement(By.className("card-content"));
		System.out.println("The contents are: " + cardContent.getText());

		// get attribute

		WebElement ele = driver.findElement(By.id("join"));
		System.out.println(ele.getAttribute("id"));
		System.out.println(ele.getAttribute("value"));
		System.out.println(ele.getAttribute("type"));
		System.out.println(ele.getAttribute("placeholder"));
		System.out.println(ele.getAttribute("class"));
		
		driver.quit();

	}

}
