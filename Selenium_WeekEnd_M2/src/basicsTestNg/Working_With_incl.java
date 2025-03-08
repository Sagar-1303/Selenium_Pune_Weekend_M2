package basicsTestNg;

import org.testng.annotations.Test;

public class Working_With_incl {

	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void register() {
		System.out.println("Register");
	}

	@Test
	public void delete() {
		System.out.println("Delete");
	}

}
