package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_With_if {
	
	
	@Test
	public void demo() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.whatsapp.com");

		String title = driver.getTitle();

		if (title.contains("jjkncaa")) {
			System.out.println("Pass");
			driver.findElement(By.xpath("(//span[text()='Help Center'])[2]")).click();
		}
		else {
			System.out.println("Fail");
		}
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
