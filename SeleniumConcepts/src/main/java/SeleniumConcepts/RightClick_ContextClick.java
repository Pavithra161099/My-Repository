package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.lambdatest.com/selenium-playground/context-menu");
		WebElement ele = driver.findElement(By.id("hot-spot"));
		Actions action = new Actions(driver);
		action.contextClick(ele).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
