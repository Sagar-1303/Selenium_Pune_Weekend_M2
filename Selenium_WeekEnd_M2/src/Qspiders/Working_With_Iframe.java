package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("Qsp");
		driver.switchTo().parentFrame();
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		driver.switchTo().parentFrame().switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("Qsp");
		driver.switchTo().parentFrame();
		driver.findElement(By.partialLinkText("Nested with Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0).switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		driver.switchTo().parentFrame().switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys("Qsp@1234");

		Thread.sleep(3000);
		driver.quit();

	}

}
