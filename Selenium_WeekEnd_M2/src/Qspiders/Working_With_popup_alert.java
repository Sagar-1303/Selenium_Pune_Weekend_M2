package Qspiders;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_popup_alert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[contains(text(),'alert')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
		Thread.sleep(2000);
		Alert ele = driver.switchTo().alert();
		System.out.println(ele.getText());
		ele.accept();

		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();
		Thread.sleep(2000);
		Alert ele1 = driver.switchTo().alert();
		ele1.sendKeys("Akshay");
		Thread.sleep(2000);
		ele1.accept();

		Thread.sleep(3000);
		driver.quit();

	}

}
