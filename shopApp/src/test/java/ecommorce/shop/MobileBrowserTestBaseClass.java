package ecommorce.shop;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class MobileBrowserTestBaseClass  {
	
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
		options.setCapability("browserName", "Chrome");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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

