package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_bigBasket {

	@Test
	public void bigBasket() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://bigbasket.com/");

		driver.findElement(By.xpath("(//div[contains(@class,'DeckImage')])[1]")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
