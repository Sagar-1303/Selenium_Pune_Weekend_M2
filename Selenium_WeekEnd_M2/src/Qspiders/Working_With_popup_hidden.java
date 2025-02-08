package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_popup_hidden {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9865326598");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
