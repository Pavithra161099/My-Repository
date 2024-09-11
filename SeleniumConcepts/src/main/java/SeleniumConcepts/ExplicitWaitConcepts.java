package SeleniumConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

//		// wait for alert
//		driver.get("https://letcode.in/waits");
//		driver.findElement(By.id("accept")).click();
//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(until.getText());
//		until.accept();

		// invisibity
//		driver.get("https://letcode.in/signin");
//		driver.findElement(By.name("email")).sendKeys("preethi161099@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("PaVi@161099");
//		driver.findElement(By.xpath("//button[normalize-space(text())='LOGIN']")).click();
//		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
//		wait.until(ExpectedConditions.visibilityOf(toast));
//		System.out.println(toast.getText());
//		wait.until(ExpectedConditions.invisibilityOf(toast));
//		driver.findElement(By.xpath("//a[normalize-space(text())='Sign out']")).click();

		// wait for title change
		driver.get("https://www.baeldung.com/");
		WebElement elec = driver.findElement(By.xpath("//a[@id='menu-item-39050']"));
		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		action.moveToElement(elec).perform();
		WebElement active = driver.findElement(By.xpath("//h3[normalize-space(text())='Spring Boot']"));
		wait.until(ExpectedConditions.visibilityOf(active));
		active.click();
		wait.until(ExpectedConditions.titleContains("Learn Spring Boot"));
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
