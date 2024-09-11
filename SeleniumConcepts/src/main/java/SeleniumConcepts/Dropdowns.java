package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// select the apple using visible text, index and value
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select myFavFruit = new Select(fruits);
		myFavFruit.selectByIndex(0);
		myFavFruit.selectByValue("1");
		myFavFruit.selectByVisibleText("Banana");
		System.out.println(myFavFruit.isMultiple());
		List<WebElement> AllFruits = myFavFruit.getOptions();
		System.out.println("The fruits list are: ");
		for (WebElement webElement : AllFruits) {
			System.out.println(webElement.getText());
		}

		// Select your super hero's
		WebElement superHeros = driver.findElement(By.id("superheros"));
		Select FavHeros = new Select(superHeros);
		FavHeros.selectByIndex(0);
		FavHeros.selectByValue("bt");
		FavHeros.selectByVisibleText("Aquaman");
		System.out.println(FavHeros.isMultiple());
		System.out.println("The heros list are: ");
		List<WebElement> herosList = FavHeros.getOptions();
		for (WebElement webElement2 : herosList) {
			System.out.println(webElement2.getText());
		}
		List<WebElement> SelectedHeros = FavHeros.getAllSelectedOptions();
		System.out.println("The selected fav heros are: ");
		for (WebElement webElement1 : SelectedHeros) {
			System.out.println(webElement1.getText());
		}

		WebElement selopt = FavHeros.getFirstSelectedOption();
		System.out.println("My first fav hero is: " + selopt.getText());

//		Select the last programming language and print all the options

		WebElement lang = driver.findElement(By.id("lang"));
		Select MyFavProgLang = new Select(lang);
		MyFavProgLang.selectByIndex(2);
		MyFavProgLang.selectByValue("js");
		MyFavProgLang.selectByVisibleText("Java");

		System.out.println("My fav programming language is: " + MyFavProgLang.getFirstSelectedOption().getText());

		List<WebElement> AllProgLang = MyFavProgLang.getOptions();
		System.out.println("The All listed programming languages are: ");
		for (WebElement webElement3 : AllProgLang) {
			System.out.println(webElement3.getText());
		}

		// Select India using value & print the selected value
		WebElement country = driver.findElement(By.id("country"));
		Select MyCountry = new Select(country);
		MyCountry.selectByValue("India");
		System.out.println("The selected value is: " + MyCountry.getFirstSelectedOption().getText());

		driver.quit();
	}

}
