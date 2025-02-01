package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_customWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		int i=0;
		while (i<100) {
			try {
				driver.findElement(By.id("name")).sendKeys("Qsp");
				break;
			} catch (NoSuchElementException e) {
				i++;
			}
		}

		System.out.println(i);
		Thread.sleep(3000);
		driver.quit();

	}

}
