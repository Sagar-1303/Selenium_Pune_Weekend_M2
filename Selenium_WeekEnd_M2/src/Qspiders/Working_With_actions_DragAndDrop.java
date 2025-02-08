package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_actions_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		driver.get("https://www.flipkart.com/");

		WebElement src = driver.findElement(By.id("box3"));
		WebElement dest = driver.findElement(By.id("box103"));
		
		Actions act=new Actions(driver);
//		act.dragAndDrop(src, dest).perform();
		act.clickAndHold(src).pause(3000).release(dest).perform();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement src1 = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
		
		act.dragAndDropBy(src1,-150,0).perform();
		
//		Thread.sleep(2000);
//		act.release(dest).perform();

//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9623515765");
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
