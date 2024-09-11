package LearnTestNGBasics;

import org.testng.annotations.Test;

public class PriorityAttributes {

	@Test(priority = -1)
	public void signup() {

		System.out.println("SignUp");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void searchProduct() {
		System.out.println("SearchProduct");
	}

	@Test
	public void addCart() {
		System.out.println("Addcart");
	}

	@Test(priority = -5)
	public void logout() {
		System.out.println("LogOut");
	}

}
