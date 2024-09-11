package LearnTestNGBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.DataUtils;

//public class DataProviderAndIndicesConcept extends DataUtils{
public class DataProviderAndIndicesConcept {
	/*
	 * @Parameters({ "emailId" }) // we cannot use parameters and data providers at
	 * the same time, it will throw // Data provider mismatch message
	 * 
	 * @Test(dataProvider = "getData", dataProviderClass = DataUtils.class) public
	 * void login(String emailId, String email, String pass) {
	 * 
	 * System.out.println(email); System.out.println(emailId);
	 * System.out.println(pass);
	 * 
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 * ChromeDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize(); WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(30));
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // submit()
	 * driver.get("https://letcode.in");
	 * driver.findElement(By.linkText("Log in")).click();
	 * driver.findElement(By.name("email")).sendKeys(email);
	 * driver.findElement(By.name("password")).sendKeys(pass);
	 * driver.findElement(By.xpath("//button[.='LOGIN']")).click(); WebElement toast
	 * = driver.findElement(By.xpath("//div[@role='alertdialog']"));
	 * wait.until(ExpectedConditions.visibilityOf(toast));
	 * System.out.println(toast.getText());
	 * wait.until(ExpectedConditions.invisibilityOf(toast));
	 * driver.findElement(By.xpath("//a[normalize-space(text())='Sign out']")).click
	 * (); driver.quit();
	 */

	// if we have more than 20 test data, in that time we cannot pass all of those
	// here as a arguments so we can use data [] in an array like below
	@Test(dataProvider = "getData", dataProviderClass = DataUtils.class)
	public void get(String data[]) {
		System.out.println(data[0]);
		System.out.println(data[1]);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // submit()
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast));
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign out']")).click();
		driver.quit();

	}
}
