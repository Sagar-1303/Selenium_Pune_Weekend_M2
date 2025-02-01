package Qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
//		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
