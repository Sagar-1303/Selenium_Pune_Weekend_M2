package basicsTestNg;

import org.testng.annotations.Test;

public class Working_With_dependsOnMethod {

	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void register() {
		System.out.println("Register");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.id("acacs")).click();
	}

	@Test(dependsOnMethods = {"register","login"})
	public void delete() {
		System.out.println("Delete");
	}

}
