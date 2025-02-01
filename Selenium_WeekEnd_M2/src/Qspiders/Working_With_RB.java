package Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_RB {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> rb = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
//		System.out.println(rb.size());
		for (int i = 0; i < rb.size(); i++) {
			Thread.sleep(1000);
			rb.get(i).click();
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
