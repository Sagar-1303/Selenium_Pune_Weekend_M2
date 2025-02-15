package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_javaScript_disableTextField {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/index.php");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		js.executeScript("arguments[0].value='hello';",ele);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,400);");
		driver.findElement(By.id("hide-textbox")).click();
		WebElement element = driver.findElement(By.id("displayed-text"));
		js.executeScript("arguments[0].value='bye';",element);
		driver.findElement(By.id("show-textbox")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
