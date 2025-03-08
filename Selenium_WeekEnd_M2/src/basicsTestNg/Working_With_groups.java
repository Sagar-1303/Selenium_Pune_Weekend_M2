package basicsTestNg;

import org.testng.annotations.Test;

public class Working_With_groups {

	@Test(groups = "smoke")
	public void login() {
		System.out.println("Login");
	}

	@Test(groups = "system")
	public void register() {
		System.out.println("Register");
	}

	@Test(groups = "smoke")
	public void delete() {
		System.out.println("Delete");
	}
	
	@Test(groups = "system")
	public void logOut() {
		System.out.println("LogOut");
	}
	
}
