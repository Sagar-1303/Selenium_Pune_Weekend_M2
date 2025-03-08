package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_With_parameter {

	@Parameters({ "browserUrl", "browserName" })
	@Test
	public void parameter(String url, String browser) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);

		System.out.println(browser);

		Thread.sleep(3000);
		driver.quit();

	}

}
