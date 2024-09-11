package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationWidthHeightAndCssValue {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load https://letcode.in/buttons
		driver.get("https://letcode.in/buttons");

		// Get the X & Y co-ordinates
//		driver.findElement(By.id("position")).getLocation();
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x=> " + x + " y=> " + y);

		// Find the color of the button
		WebElement btncolor = driver.findElement(By.id("color"));
		System.out.println(btncolor.getCssValue("background-color"));

		// Find the height & width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		Dimension dime = rect.getDimension();
		System.out.println(dime);
		System.out.println("Button width is: " + dime.getHeight() + " & Button height is: " + dime.getWidth());

		// Confirm button is disabled
		System.out.println(driver.findElement(By.id("isDisabled")).isEnabled());
		
		
		driver.quit();

	}

}
