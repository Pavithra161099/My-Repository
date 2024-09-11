package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigationClass {

	public static void main(String[] args) throws InterruptedException {

		
		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Navigation nav = driver.navigate();

		// load https://letcode.in/buttons
		driver.get("https://letcode.in/buttons");
		String buttonUrl = driver.getCurrentUrl();
		System.out.println("Button url is:" + buttonUrl);

		// click on goto home button
		driver.findElement(By.id("home")).click();
		String homeUrl = driver.getCurrentUrl();
		System.out.println("Home url is:" + homeUrl);

		// Navigate to go back
		nav.back();
		String Url = driver.getCurrentUrl();
		System.out.println("current url is:" + Url);

		// refresh the page
		nav.refresh();

		// Navigate to go forward
		nav.forward();
		nav.to("https://letcode.in/signin");
		System.out.println("current url is:" + Url);

		// click login button
		driver.findElement(By.linkText("Log in")).click();

		// enter email and password
		driver.findElement(By.name("email")).sendKeys("preethi161099@gmail.com");
		driver.findElement(By.name("password")).sendKeys("PaVi@161099");

		// click login button
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();

		Thread.sleep(3000);
	}

}
