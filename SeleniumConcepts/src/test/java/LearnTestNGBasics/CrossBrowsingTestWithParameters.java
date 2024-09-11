package LearnTestNGBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTestWithParameters {

	RemoteWebDriver driver;

	@Parameters({ "emailId", "password", "broswer" })
	@Test
	public void loginAndlogoutTest(String email, String pass, String browser) throws InterruptedException {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser not defined");
			break;
		}
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// submit()
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast));
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign out']")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
