package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	WebDriver driver;
	WebDriverWait wait;

	@Given(value = "User should navigate to the application")
	public void userShouldNavigate() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://letcode.in/");
	}

	@Given("Click on login link")
	public void clickOnLoginLink() {
		driver.findElement(By.xpath("//a[normalize-space(text())='Log in']")).click();

	}

	/*
	 * @Given("User enter the username as preethi{int}@gmail.com") public void
	 * userEnterTheUsernameAsPreethiGmailCom(Integer int1) {
	 * driver.findElement(By.name("email")).sendKeys("preethi161099@gmail.com"); }
	 * 
	 * @Given("User enter the password as PaVi@161099") public void
	 * userEnterThePasswordAsPaVi161099() {
	 * driver.findElement(By.name("password")).sendKeys("PaVi@161099"); }
	 */

	@When("User click the login button")
	public void userClickTheLoginButton() {
		driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]")).click();
	}

	@Then("login should be successful")
	public void loginShouldBeSuccessful() {
		String text = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();
		Assert.assertEquals(text.trim(), "Welcome Pavithra");
		driver.quit();

	}

	/*
	 * @Given("User enter the username as pavithraraman2@gmail.com") public void
	 * userEnterTheUsernameAsPavithraramanGmailCom() {
	 * driver.findElement(By.name("email")).sendKeys("pavithraraman2@gmail.com"); }
	 * 
	 * @Given("User enter the password as PaVi") public void
	 * userEnterThePasswordAsPaVi() {
	 * driver.findElement(By.name("password")).sendKeys("PaVi"); }
	 */

	@Then("login should fail")
	public void loginShouldFail() {
		String text = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();
		Assert.assertEquals(text.trim(),
				"Error: There is no user record corresponding to this identifier. The user may have been deleted.");
		driver.quit();
	}

	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		driver.findElement(By.name("email")).sendKeys(username);
	}

	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

}
