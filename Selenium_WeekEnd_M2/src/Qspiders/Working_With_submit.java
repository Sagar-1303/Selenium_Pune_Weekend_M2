package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_submit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		
		driver.findElement(By.id("email")).clear();
		String tag = driver.findElement(By.id("email")).getTagName();
		System.out.println(tag);
		Thread.sleep(1000);
		driver.findElement(By.id("user_login_btn")).submit();

		Thread.sleep(3000);
		driver.quit();

	}

}
