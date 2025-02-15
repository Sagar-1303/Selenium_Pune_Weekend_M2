package Qspiders;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_popup_childWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://secure.indeed.com/");

		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();

		Set<String> ids = driver.getWindowHandles();
		for (String string : ids) {
			Thread.sleep(2000);
			driver.switchTo().window(string);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("account_name_text_field")).sendKeys("hello");

		Thread.sleep(3000);
		driver.quit();

	}

}
