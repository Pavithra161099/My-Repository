package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAuthenticationPopUp {

	@Test
	public void handleAuthenticationPopup() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// https://admin:admin@the-internet.herokuapp.com/basic_auth
		String username = "admin";
		String password = "admin";
		driver.get("https://" + username + ":" + password + "@"+"the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("div#content>div>p")).getText();
		Assert.assertEquals(text.trim(), "Congratulations! You must have the proper credentials.");

//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		alert.authenticateUsing(new UserAndPassword(username, password));

		driver.quit();

	}

}
