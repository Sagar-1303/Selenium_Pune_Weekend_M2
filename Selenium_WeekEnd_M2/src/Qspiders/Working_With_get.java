package Qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_get {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
//		String source = driver.getPageSource();
//		System.out.println(source);
		
//		driver.close();
		driver.quit();
		
	}

}
