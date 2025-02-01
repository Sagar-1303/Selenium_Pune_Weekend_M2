package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_xpathByText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		//Example For Text Function
		driver.findElement(By.xpath("//span[text()='Flight Bookings']")).click();
		
		//Example For Contains
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
		//Example For Contains With Attribute
		driver.findElement(By.xpath("//a[contains(@class,'ico-r')]")).click();
		
		//Example For Contains With Text Function
		driver.findElement(By.xpath("//span[contains(text(),'Shopping')]")).click();
		
		//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div
		
		Thread.sleep(3000);
		driver.quit();

	}

}
