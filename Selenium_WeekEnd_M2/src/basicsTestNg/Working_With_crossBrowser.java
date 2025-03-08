package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_With_crossBrowser {
	
	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void crossBrowser(String browser) throws InterruptedException {
		
		if (browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Please Enter Valid Browser Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.croma.com/");
		
		driver.findElement(By.id("searchV2")).sendKeys("camera"+Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
