package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_relativeXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Jsp");
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
