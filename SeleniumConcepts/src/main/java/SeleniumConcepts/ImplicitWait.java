package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// window maximize
		driver.manage().window().maximize();

		// 2. load the url
		driver.get("https://letcode.in");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 3. click sign up and enter email and password
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("Pavithra");
		driver.findElement(By.id("email")).sendKeys("preethi161099@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("PaVi@161099");

		driver.quit();

	}

}
