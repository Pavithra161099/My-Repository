package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// submit()
		driver.get("https://letcode.in");

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.name("email")).sendKeys("preethi161099@gmail.com");
		driver.findElement(By.name("password")).sendKeys("PaVi@161099");
		driver.findElement(By.xpath("//button[.='LOGIN']")).submit(); // submit() is used when form used in HTML code

		Thread.sleep(2000);

		// submit() using in normal button
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("home")).submit();// threw exception-java.lang.UnsupportedOperationException: To submit
													// an element, it must be nested inside a form element

		driver.quit();

	}

}
