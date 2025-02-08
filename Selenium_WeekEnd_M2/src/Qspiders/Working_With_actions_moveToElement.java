package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_actions_moveToElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement ele = driver.findElement(By.partialLinkText("COMP"));
		
		Point loc = ele.getLocation();
		
		Actions act=new Actions(driver);
//		act.moveToElement(ele).perform();
//		act.moveByOffset(loc.getX(),loc.getY()).perform();
//		act.moveToLocation(loc.getX(),loc.getY()).perform();
		
//		act.moveToElement(ele).click().perform();
		act.click(ele).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
