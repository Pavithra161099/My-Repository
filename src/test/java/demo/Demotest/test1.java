package demo.Demotest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void test1() {
		System.setProperty("websriver.chrome.driver", "//Users//vijaya.bonthu//Downloads//chromedriver-mac-x64//chromedriver");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	

	}
}
