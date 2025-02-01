package Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_getAttribute_Urls {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		List<WebElement> links1 = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links1.size(); i++) {
//			String url = links1.get(i).getAttribute("href");
//			String url = links1.get(i).getDomProperty("href");
			String url = links1.get(i).getDomAttribute("href");
			System.out.println(url);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
