package basicsTestNg;

import org.testng.annotations.Test;

public class Demo {

	@Test(priority = 1)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority = 0)
	public void register() {
		System.out.println("Register");
	}

	@Test(priority = 2)
	public void delete() {
		System.out.println("Delete");
	}

}
