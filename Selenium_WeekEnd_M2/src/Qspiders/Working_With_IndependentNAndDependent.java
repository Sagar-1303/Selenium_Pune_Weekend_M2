package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_IndependentNAndDependent {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(price);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
