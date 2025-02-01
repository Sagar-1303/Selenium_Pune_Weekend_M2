package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Method {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("QSP");
		driver.findElement(By.name("pass")).sendKeys("QSP");
		
//		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.partialLinkText("Create new")).click();
		
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
