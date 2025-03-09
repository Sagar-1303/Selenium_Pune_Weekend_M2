package Qspiders;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_activeElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().activeElement().sendKeys("qsp@gmail.com"+Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Qsp@1234"+Keys.TAB+Keys.TAB);
		driver.switchTo().activeElement().click();

		Thread.sleep(3000);
		driver.quit();

	}

}
