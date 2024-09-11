package SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		/*
		 * we have only 3 alerts in web pages- once alert get, we cannot do any action
		 * on webpage without handle alerts 1. Simple alert which is having only 'ok'
		 * button 2. Confirm alert which is having both 'ok' and 'cancel' button. 3.
		 * Prompt alert which is having a text box to enter the input and click ok
		 * button
		 */

		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load https://letcode.in/buttons
		driver.get("https://letcode.in/alert");

		// 1. Simple alert
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
//		alert.dismiss();   //accept and dismiss both accepting in simple alerts

		// 2. Confirm alert
		driver.findElement(By.id("confirm")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.id("confirm")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();

		// 3. Prompt alert
		driver.findElement(By.id("prompt")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Preethi");
		alert.accept();
		System.out.println(driver.findElement(By.id("myName")).getText());

		driver.quit();
	}

}
