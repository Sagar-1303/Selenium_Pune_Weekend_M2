package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_getDomProperty {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("qspiders");
//		System.out.println(ele.getAttribute("value"));
//		System.out.println(ele.getDomProperty("value"));
		System.out.println(ele.getDomAttribute("value"));

		Thread.sleep(3000);
		driver.quit();

	}

}
