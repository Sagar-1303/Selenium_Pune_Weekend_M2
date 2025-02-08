package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_doubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions act=new Actions(driver);
//		act.doubleClick(ele).perform();
		
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(right).perform();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
