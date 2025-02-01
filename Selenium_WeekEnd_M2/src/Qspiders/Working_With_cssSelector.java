package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_cssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

//		driver.findElement(By.cssSelector("input#email")).sendKeys("Qspiders");
//		driver.findElement(By.cssSelector("#email")).sendKeys("Qspiders");
		
//		List<WebElement> ele = driver.findElements(By.cssSelector("input.inputtext"));
//		List<WebElement> ele = driver.findElements(By.cssSelector(".inputtext"));
//		ele.get(1).sendKeys("Qsp");
		
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Qsp");
//		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Qsp");

//		driver.findElement(By.cssSelector("input.inputtext[type='password']")).sendKeys("Qspiders");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
