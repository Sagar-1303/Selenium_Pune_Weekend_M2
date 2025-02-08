package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_actions_keyBoard {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		WebElement ele = driver.findElement(By.id("small-searchterms"));

		Actions act = new Actions(driver);
//		act.moveToElement(ele).click().sendKeys("books").perform();
//		act.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("books").keyUp(Keys.SHIFT).perform();

		act.click(ele).keyDown(Keys.SHIFT).sendKeys("books").keyUp(Keys.SHIFT).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
