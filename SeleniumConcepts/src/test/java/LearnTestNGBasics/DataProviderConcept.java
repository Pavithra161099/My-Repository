package LearnTestNGBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	@DataProvider(name = "login")
	public String[][] getData() {

		String[][] data = new String[3][2];
		// 1st row
		data[0][0] = "preethi161099@gmail.com";
		data[0][1] = "PaVi@161099";

		// 2nd row
		data[1][0] = "koushik1@letcode.in";
		data[1][1] = "Pass123$";

		// 3rd row
		data[2][0] = "koushik350@gmail.com";
		data[2][1] = "Pass123$";

		return data;

	}

	@Test(dataProvider = "login")
	public void logintest(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// submit()
		driver.get("https://letcode.in");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast));
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign out']")).click();

		driver.quit();
	}

}
