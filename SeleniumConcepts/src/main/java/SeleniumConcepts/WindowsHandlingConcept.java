package SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		System.out.println("current window: " + driver.getWindowHandle());

		/*
		 * open windows->click home page button->this will be opening in new window->
		 * current window is /test->close the /windows and get current windows only*
		 */
		driver.findElement(By.id("home")).click();// click the go home page button
		System.out.println(driver.getCurrentUrl());// get current url(/windows)
		Set<String> WindowHandler1 = driver.getWindowHandles(); // get windows handles and stored in set of strings and
																// as we don't have get method in set we are creating
																// the list to get
		List<String> list = new ArrayList<String>(WindowHandler1);// list created with window handles

		driver.switchTo().window(list.get(1)); // switching to the 2nd window(/test) by helping the List get ()
		System.out.println(driver.getCurrentUrl()); // Getting current url(/test)
		driver.switchTo().window(list.get(0));// switching to the 1nd window(/windows) by helping the List get ()
		driver.close(); // close it
//		System.out.println(driver.getCurrentUrl());// After closed, we cannot get the current url. it will threw no such window: target window already closed
		Set<String> WindowHandler2 = driver.getWindowHandles();// So we have to handle windows again and create list for
																// that.
		list = new ArrayList<String>(WindowHandler2);
		list.clear();// clear the list
		list.addAll(WindowHandler2);// add all windows to the list
		driver.switchTo().window(list.get(0));// switching to the 1nd window(/test) by helping the List get ()
		System.out.println(driver.getCurrentUrl());// Getting current url(/test)
		
		
		driver.quit();
		

	}

}
