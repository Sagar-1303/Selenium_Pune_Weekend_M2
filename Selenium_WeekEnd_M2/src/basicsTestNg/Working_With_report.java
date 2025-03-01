package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Working_With_report {

	@Test
	public void demo() throws InterruptedException {

		System.out.println("Demo");
		Reporter.log("Hi");
		Reporter.log("Hello",false);
		Reporter.log("Bye",true);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		Thread.sleep(3000);
		driver.quit();

	}

}
