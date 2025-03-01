package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_flipkart {

	@Test
	public void flipkart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("realme"+Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
