package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Working_With_softAssert {

	@Test
	public void softAssert() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.whatsapp.com");

		String title = driver.getTitle();
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title,"dava");
		
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Help Center'])[2]"));
		ele.click();

		sa.assertAll();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
