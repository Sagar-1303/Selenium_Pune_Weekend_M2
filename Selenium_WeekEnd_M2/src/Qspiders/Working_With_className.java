package Qspiders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_className {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		//To get All the LinkText
//		driver.findElement(By.className("ico-login")).click();
//		List<WebElement> links = driver.findElements(By.tagName("a"));

//		for (int i = 0; i < links.size(); i++) {
//			String text = links.get(i).getText();
//			if (text.isEmpty()) {
//
//			} else {
//				System.out.println(text);
//			}
//		}

		//To get All the Url's
		
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links1.size(); i++) {
			String url = links1.get(i).getAttribute("href");
			System.out.println(url);
		}
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
