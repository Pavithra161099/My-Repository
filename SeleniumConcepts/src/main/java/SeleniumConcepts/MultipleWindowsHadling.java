package SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHadling {

	public static void main(String[] args) {
		/*
		 * 1. Click on the home button 2. Goto the newly opened tab 3. Print the title
		 * of the page 4. Close the parent window 5. Close the child window 6. Click on
		 * the Multiple windows button 7. Print all the window title 8. Close all the
		 * windows
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/windows");
		driver.findElement(By.id("home")).click();// 1. Click on the home button
		Set<String> windowHandler1 = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandler1);
		driver.switchTo().window(list.get(1));// 2. Goto the newly opened tab
		System.out.println(driver.getTitle());// 3. Print the title of the page
		driver.switchTo().window(list.get(0));
		driver.close();// 4. Close the parent window
		Set<String> windowHandler2 = driver.getWindowHandles();
		list = new ArrayList<String>(windowHandler1);
		list.clear();
		list.addAll(windowHandler2);
		driver.switchTo().window(list.get(0));
		driver.close();// 5. Close the child window

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();

		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver2.get("https://letcode.in/windows");
		driver2.findElement(By.id("multi")).click(); // 6. Click on the Multiple windows button
		Set<String> windowHandler3 = driver2.getWindowHandles();
		list = new ArrayList<String>(windowHandler3);
		driver2.switchTo().window(list.get(1));
		System.out.println(driver2.getTitle());// 7. Print all the window title
		driver2.switchTo().window(list.get(2));
		System.out.println(driver2.getTitle());// 7. Print all the window title
		driver2.close(); // Close all the windows

		Set<String> windowHandler4 = driver2.getWindowHandles();
		list = new ArrayList<String>(windowHandler4);
		list.clear();
		list.addAll(windowHandler4);
		driver2.switchTo().window(list.get(1));
		driver2.close(); // Close all the windows

		Set<String> windowHandler5 = driver2.getWindowHandles();
		list = new ArrayList<String>(windowHandler5);
		list.clear();
		list.addAll(windowHandler5);
		driver2.switchTo().window(list.get(0));
		driver2.close();// Close all the windows

		driver2.quit();

	}

}
