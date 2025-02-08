package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Working_With_actions_scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
//		act.scrollByAmount(0,500).perform();
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Oracle Database Enterprise Edition']"));
//		act.scrollToElement(ele).perform();
		
		ScrollOrigin orgin = ScrollOrigin.fromElement(ele);
		act.scrollFromOrigin(orgin,0,600).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
