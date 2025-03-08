package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_With_hardAssert {

	@Test
	public void hardAssert() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.whatsapp.com");

		String title = driver.getTitle();
		
		Assert.fail();
		
		Assert.assertEquals(title,"WhatsApp | Secure and Reliable Free Private Messaging and Calling");

//		Assert.assertNull(title);
		Assert.assertNotNull(title);
		
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Help Center'])[2]"));
		boolean dis = ele.isDisplayed();
		
		Assert.assertTrue(dis);
//		Assert.assertFalse(dis);
		
		ele.click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
