package Qspiders;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_cookies {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
//		System.out.println(driver.manage().getCookieNamed("datr"));
		
//		driver.manage().deleteAllCookies();
		
//		driver.manage().deleteCookieNamed("datr");
		
		Cookie coo=new Cookie("Qspiders","Selenium");
		
		driver.manage().addCookie(coo);
		
		System.out.println(driver.manage().getCookieNamed("Qspiders"));
		
		driver.manage().deleteCookie(coo);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
			System.out.println(cookie.getPath());
			System.out.println(cookie.getSameSite());
			System.out.println(cookie.getExpiry());
			System.out.println(cookie.getDomain());
			System.out.println("-----------------------------");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
