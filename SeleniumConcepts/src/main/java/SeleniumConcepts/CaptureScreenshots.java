package SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshots {

	public static void main(String[] args) throws IOException {

		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// load https://letcode.in/buttons
		driver.get("https://letcode.in/buttons");

		// take screen shot of whole web page
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/img1.png");
		FileHandler.copy(src, dest);

		// take screen shot of element in that web page
		WebElement ele = driver.findElement(By.id("home"));
		File elesrc = ele.getScreenshotAs(OutputType.FILE);
		File eledest = new File("./Screenshots/img2.png");
		FileHandler.copy(elesrc, eledest);
		
		// take screen shot of section in that web page
		WebElement ele2  =driver.findElement(By.xpath("(//div[@class='card-content'])[2]"));
		elesrc =ele2.getScreenshotAs(OutputType.FILE);
		eledest= new File("./Screenshots/img3.png");
		FileHandler.copy(elesrc, eledest);
		
		driver.quit();

	}

}
