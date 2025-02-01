package Qspiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Browser_InNewVersion {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver=new EdgeDriver();
		
	}

}
