package LearnTestNGBasics;

import org.testng.annotations.Test;

public class GroupsAttribute {
	@Test(groups = {"smoke"})
	private void signup() {
		System.out.println("sign up");
	}

	@Test(groups = {"regression"})
	private void login() {
		System.out.println("login");
	}

	@Test(groups = {"sanity"})
	private void searchproducts() {
		System.out.println("search products");
	}

	@Test(groups = {"smoke"})
	private void addtocart() {
		System.out.println("add to cart");
	}

	@Test(groups = {"regression"})
	private void logout() {
		System.out.println("log out");
	}

}
