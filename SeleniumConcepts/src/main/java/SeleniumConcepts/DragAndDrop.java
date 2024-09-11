package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		

//		//perform drag and drop
//		driver.get("https://letcode.in/dropable");
//		
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		
//		Actions builder = new Actions(driver);
//		builder.dragAndDrop(source, target).perform();

		// Perform drag and drop by
	
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		int x = source.getLocation().getX();
		int y = source.getLocation().getY();

		builder.dragAndDropBy(source, x + 20, y + 90).perform();

//		driver.quit();

	}

}
