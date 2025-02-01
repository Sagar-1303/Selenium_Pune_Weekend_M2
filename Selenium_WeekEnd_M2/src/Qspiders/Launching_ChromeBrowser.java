package Qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_ChromeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//		FirefoxDriver driver1=new FirefoxDriver();
		driver=new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
//		EdgeDriver driver2=new EdgeDriver();
		driver=new EdgeDriver();
		
	}

}
