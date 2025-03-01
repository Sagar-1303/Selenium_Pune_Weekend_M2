package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_threadPoolSize {

	@Test(invocationCount = 5,threadPoolSize = 10)
	public void demo() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.quit();

	}

}
