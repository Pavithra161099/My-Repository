package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		/*
		 * 1. Launch the browser 2. load the url 3. click sign up 4. enter name 5. enter
		 * mail id 6. enter password 7. click agree TCs 8. Click sing up button 9. After
		 * successful sign up, click login button
		 */

		// 1. Launch the browser
		System.setProperty("websriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		// 2. load the url
		driver.get("https://letcode.in");

//		// 3. click sign up
//		driver.findElement(By.linkText("Sign up")).click();
//
//		// 4. enter name
//		driver.findElement(By.id("name")).sendKeys("Pavithra");
//
//		// 5. enter mail id
//		driver.findElement(By.id("email")).sendKeys("preethi161099@gmail.com");
//
//		// 6. enter password
//		driver.findElement(By.id("pass")).sendKeys("PaVi@161099");
//
//		// 7. click agree TCs
//		driver.findElement(By.id("agree")).click();
//
//		// 8. Click sing up button
//		driver.findElement(By.xpath("//button[.='SIGN UP']")).click();

		// 9. After successful sign up, click login
		driver.findElement(By.linkText("Log in")).click();

		// 10. enter email id
		driver.findElement(By.name("email")).sendKeys("preethi161099@gmail.com");
		
		// 11. enter password
		driver.findElement(By.name("password")).sendKeys("PaVi@161099");
		
		// 12. click login button
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();

	}

}
