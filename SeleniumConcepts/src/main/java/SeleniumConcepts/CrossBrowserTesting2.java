package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting2 {


	@Test
	public void handleAuthenticationPopup() {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// https://admin:admin@the-internet.herokuapp.com/basic_auth
		String username = "admin";
		String password = "admin";
		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("div#content>div>p")).getText();
		Assert.assertEquals(text.trim(), "Congratulations! You must have the proper credentials.");
		System.out.println("Testing completed in Firefox");
		driver.quit();

	}
}
