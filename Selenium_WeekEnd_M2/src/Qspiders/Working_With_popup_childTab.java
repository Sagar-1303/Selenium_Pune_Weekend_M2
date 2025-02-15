package Qspiders;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_popup_childTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");

		driver.findElement(By.name("q")).sendKeys("iphone 15" + Keys.ENTER);

		String id = driver.getWindowHandle();
		System.out.println(id);

		List<WebElement> elements = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 15')]"));
		elements.get(0).click();
		elements.get(1).click();

		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids.size());

		for (String string : ids) {
			Thread.sleep(2000);
			driver.switchTo().window(string);

			String title = driver.getTitle();
			if (title.contains("Pink")) {
				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
				break;
			}

		}

		Thread.sleep(3000);
		driver.quit();

	}

}
