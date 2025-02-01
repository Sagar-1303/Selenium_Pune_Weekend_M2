package Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_id_locator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Qsp@1234"+Keys.TAB+Keys.ENTER);
		
//		driver.findElement(By.linkText("Create new account")).click();
		
//		driver.findElement(By.partialLinkText("Create")).click();
		
		List<WebElement> elements = driver.findElements(By.partialLinkText("Create"));
		
		System.out.println(elements.size());
		
		elements.get(1).click();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
