package Qspiders;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_propertyFile {

	public static void main(String[] args) throws InterruptedException, IOException {

		FileInputStream fis=new FileInputStream("./files/propertyData.properties");
		Properties pro=new Properties();
		pro.load(fis);
//		Object value = pro.get("url");
		
//		String value = pro.getProperty("un");
//		System.out.println(value);
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(pro.getProperty("url"));

		driver.findElement(By.id("email")).sendKeys(pro.getProperty("un"));
		driver.findElement(By.id("pass")).sendKeys(pro.getProperty("pwd"));
		
		Thread.sleep(3000);
		driver.quit();

	}

}
