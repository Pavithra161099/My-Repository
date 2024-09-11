package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputsHandling {

	public static void main(String[] args) {

		// 1. Launch the browser
		System.setProperty("websriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// 2. load the url
		driver.get("https://letcode.in/edit");

		// 3.enter fullname
		driver.findElement(By.id("fullName")).sendKeys("Pavithra");

		// 4. Append a text and press key TAB
		driver.findElement(By.id("join")).sendKeys(" Person", Keys.TAB);

		// 5.get the text in input box
		String value = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(value);

		// 6.clear the text
		driver.findElement(By.id("clearMe")).clear();

		// 7.confirm the edit field is disabled
		boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);

		// 8.confirm the text is readonly
		String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);

		// quit the driver
		driver.quit();

	}

}
