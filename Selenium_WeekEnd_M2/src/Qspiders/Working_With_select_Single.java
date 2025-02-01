package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select_Single {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		driver.findElement(By.partialLinkText("Create new account")).click();
		WebElement dayDD = driver.findElement(By.id("month"));
		
		Select sel=new Select(dayDD);
		System.out.println(sel.isMultiple());
//		sel.selectByIndex(5);
//		sel.selectByValue("14");
//		sel.selectByVisibleText("Jun");
//		sel.selectByContainsVisibleText("Ju");
		
//		sel.deselectByIndex(5);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
