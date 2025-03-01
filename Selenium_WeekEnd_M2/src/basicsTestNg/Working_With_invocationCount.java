package basicsTestNg;

import org.testng.annotations.Test;

public class Working_With_invocationCount {

	@Test(priority = 1)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority = 0,enabled = false)
	public void register() {
		System.out.println("Register");
	}

	@Test(priority = 2,invocationCount = 5)
	public void delete() {
		System.out.println("Delete");
	}
	
}
