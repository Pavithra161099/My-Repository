package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginToAmazon {

	WebDriver driver;

	@Given("User should navigate to the amazon application")
	public void userShouldNavigateToTheAmazonApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

	}

	@Given("Search product {string}")
	public void searchProduct(String book) throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(book);
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//span[@class='s-heavy'])[1]")).click();
		driver.findElement(By.xpath("(//div[@role='button'])[1]")).click();
	}

	@Given("Add to cart")
	public void addToCart() {
//		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text')]//span)[2]")).click();
		Set windowsList = driver.getWindowHandles();
		System.out.println(driver.getCurrentUrl());
		List<String> list = new ArrayList(windowsList);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());

		WebElement ele = driver.findElement(By.id("add-to-cart-button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	@Then("Cart badge should be updated")
	public void cartBadgeShouldBeUpdated() throws InterruptedException {
		String text = driver.findElement(By.id("nav-cart-count")).getText();
		Assert.assertEquals(Integer.parseInt(text)>0, true);
		Thread.sleep(2000);
		System.out.println("cart count is: " +text);

		driver.quit();
	}
}
