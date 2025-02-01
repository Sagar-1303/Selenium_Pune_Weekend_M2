package Qspiders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_getCssValue {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String css = driver.findElement(By.partialLinkText("Register")).getCssValue("color");
		System.out.println(css);
		
		boolean sel = driver.findElement(By.id("pollanswers-1")).isSelected();
		System.out.println(sel);
		
		boolean enabled = driver.findElement(By.id("vote-poll-1")).isEnabled();
		System.out.println(enabled);
		
		boolean dis = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(dis);
		
		Point loc = driver.findElement(By.id("small-searchterms")).getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		Dimension size = driver.findElement(By.partialLinkText("BOOKS")).getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println(rect);
		System.out.println(rect.getDimension());

		Thread.sleep(3000);
		driver.quit();

	}

}
