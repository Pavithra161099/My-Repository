package LearnTestNGBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InvocationCountAndInvocationTimeoutAttribute {

	@Test(invocationCount = 1, invocationTimeOut = 30000)
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// submit()
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("preethi161099@gmail.com");
		driver.findElement(By.name("password")).sendKeys("PaVi@161099");
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
