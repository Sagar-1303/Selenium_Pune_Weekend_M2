package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_popup_datePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[text()='Prev']")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='5']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
