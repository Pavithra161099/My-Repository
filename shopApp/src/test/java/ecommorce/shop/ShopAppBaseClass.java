package ecommorce.shop;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ShopAppBaseClass  {
	
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	
 
	@BeforeClass
	public void configureAppium() throws MalformedURLException 
	{
		
		service = new AppiumServiceBuilder().withAppiumJS(new File("//usr/local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		System.out.println("Starting Appium server.....");
		//service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("emulator1");
		//options.setChromedriverExecutable("//Users//vijaya.bonthu//Downloads//chromedriver_mac_arm64//chromedriver");
		
		options.setApp("//Users//vijaya.bonthu//eclipse-workspace//shopApp//src//test//java//resources//General-Store.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	public void longPressAction(WebElement ele) {

		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
				"duration", 2000));
	}
	
	
	
	public void scrollToEndAction() {
		boolean canScrollMore;
		
		do{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		
		}while(canScrollMore);
	}
		
	
	public void swipeAction(WebElement ele, String direction ) {

		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
						"direction", direction,
					    "percent", 0.75
					    ));
			
	}
	
	public void dragDropAction(WebElement ele, int x, int y ) {

		((JavascriptExecutor)driver).executeScript("mobile: dragGesture", 
				ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),
						"endX", x ,
						"endY", y
						
					    ));
			
	}
		
	
	public Double getFormattedAmount(String amount) {
		Double price = Double.parseDouble(amount.substring(1));
		return price;
		
		
	}
		@AfterClass
		public void close() {
			System.out.println("#Stopped driver...");
			driver.quit();  //stop the driver
			System.out.println("####....Stopped Appium server....####");
			service.stop(); //stop appium server
		}
		
		
}

