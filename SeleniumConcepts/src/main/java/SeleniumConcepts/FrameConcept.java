package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
		// launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// load https://letcode.in/buttons
		driver.get("https://letcode.in/frame");

		// enter first name and last name
//		WebElement ele = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
//		driver.switchTo().frame(ele);//we can give index, web element 
		driver.switchTo().frame(0);
		driver.findElement(By.name("fname")).sendKeys("Pavithra");
		driver.findElement(By.name("lname")).sendKeys("R");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("abc@gmai.com");
//		driver.switchTo().parentFrame(); //parent frame method is used to switch back to parent (1 step ahead in the iframe) 
//		driver.findElement(By.name("lname")).clear();
//		driver.findElement(By.name("lname")).sendKeys("Raman");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch tutorial")).click();
		

	}

}
