package ecommorce.shop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends ShopAppBaseClass{
	
	@Test
	public void fillForm() throws InterruptedException {
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pavithra");
		driver.hideKeyboard();
		
		driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		
		//scroll until see Argentina
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Argentina']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		//reason of use of get(0) again -> the above add to cart button text would be changed to added to cart once clicked on it.
		//so if we give get(1)in below line, then code would be confused to get the add to cart text in the index of 1.  with text "ADD TO CART"
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		
		/*
		 * * * * use the above two line or below below lines to get button of add to cart * * * *
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART'][1]")).click();
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART'][1]")).click();
		*/

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		
		//if we want to confirm the page is navigating from products to Cart page, use WebDriverWait until method.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		
		
		List<WebElement> productPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		
		int count = productPrices.size();
		
		double totalSum = 0;
		
		for (int i=0; i<count; i++) {
			
			String amountString = productPrices.get(i).getText();
			
			//substring is used for removing first character in the string, because $160.97  to be turned to 160.97.
			//we have to convert string to double to sum the prices
			Double price = getFormattedAmount(amountString);
			
			totalSum = totalSum + price;
		}
		
		String totalAmtString = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		
		double totalAmount = getFormattedAmount(totalAmtString);
		System.out.println(totalAmount);
		Assert.assertEquals(totalAmount, totalSum);
	
		
		WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		longPressAction(ele);
		driver.findElement(By.id("android:id/button1")).click();
		
		//driver.findElement(By.xpath("//android.widget.CheckBox[@text=\"Send me e-mails on discounts related to selected products in future\"]")).click();
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		
		
		
		Thread.sleep(6000);
		
	}

}
