package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://letcode.in/edit");
//		List<WebElement> labels = driver.findElements(By.tagName("label"));
//		System.out.println("the labels presented in this current DOM page: ");
//		for (WebElement labelName : labels) {
//			System.out.println(labelName.getText());
//
//		}
//		WebElement lastEle = labels.get(labels.size() - 1);
//		System.out.println("The last element is: "+lastEle.getText());
//		int size = labels.size();
//		if (size == 6)
//			System.out.println("Test case passed");
//		else
//			System.err.println("Test case failed");

		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Java", Keys.ENTER);
		List<WebElement> java = driver
				.findElements(By.xpath("//*[contains(text(),'java') or contains(text(), 'Java')]"));
		System.out.println(java.size());

	}

}
