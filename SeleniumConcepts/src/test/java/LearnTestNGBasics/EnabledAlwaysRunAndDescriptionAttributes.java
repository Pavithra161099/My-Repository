package LearnTestNGBasics;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class EnabledAlwaysRunAndDescriptionAttributes {

	@Test(enabled = false, alwaysRun = true) // here enabled attribute is have high precedence that others. this enabled
												// attribute is used to skip in the test run
	public void signup() {
		System.out.println("SignUp");
	}

	@Test(description = "After signup and Login")
	public void login() {
		System.out.println("Login");
		throw new NoSuchElementException("Element not found");
	}

	@Test(dependsOnMethods = "login", alwaysRun = true, description = "search products")
	private void searchproducts() {
		System.out.println("SearchProducts");
	}

}
