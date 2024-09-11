package LearnTestNGBasics;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class DependsOnMethodsAttribute {

	@Test(priority = 1)
	public void signup() {
		System.out.println("SignUp");
	}

//	@Test(dependsOnMethods = "signup", priority = -1)
	@Test(dependsOnMethods = "test.Demo.get")// if we want to get method from another package
	public void login() {
		System.out.println("Login");
	}

	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("SearchProduct");
	}

	@Test(/* dependsOnMethods = "searchProduct" */ priority = 3)
	public void addCart() {
		System.out.println("Addcart");
		throw new RuntimeErrorException(null);
	}

	@Test(/* dependsOnMethods = "addCart" */ priority = 4)
	public void logout() {
		System.out.println("LogOut");
	}
	
}
