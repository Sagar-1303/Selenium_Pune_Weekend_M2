package Qspiders;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_manage {
	
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		
//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();
		
//		Dimension size = driver.manage().window().getSize();
//		
//		System.out.println(size);
//		
//		Dimension newSize=new Dimension(1500, 1500);
//		
//		driver.manage().window().setSize(newSize);
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		Point newPosition=new Point(500, 500);
		driver.manage().window().setPosition(newPosition);
		
		Thread.sleep(3000);
		driver.quit();		
		
	}

}
