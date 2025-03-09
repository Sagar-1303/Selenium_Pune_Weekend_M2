package Qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_shadowHost {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(3000);

		SearchContext shadowHost = driver.findElement(By.xpath("(//div[@class='my-3'])[1]")).getShadowRoot();

		shadowHost.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("qsp@gmail.com");

		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Login']"));

		Actions act = new Actions(driver);
		act.moveToLocation(792, 242).click().sendKeys("qsp").perform();
//		act.moveToElement(ele).click().perform();
//		act.sendKeys(Keys.TAB).perform();
//		act.sendKeys("qsp").perform();

		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui/shadow/nested?sublist=2");
		Thread.sleep(2000);

		SearchContext shadowHost1 = driver.findElement(By.xpath("//div[@class='shadowOuter']")).getShadowRoot();
		shadowHost1.findElement(By.cssSelector("label[for='email']")).click();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Hello").perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
