package SeleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowMaximize {

	@Test
	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// window maximize
		driver.manage().window().maximize();
		
		// load https://letcode.in/buttons
		driver.get("https://letcode.in/alert");
		
		
		
		driver.quit();

	}

}
