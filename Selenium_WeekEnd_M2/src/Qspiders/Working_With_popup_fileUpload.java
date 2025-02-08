package Qspiders;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_popup_fileUpload {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/Nov/file.html");

		File file = new File("./files/MultipleSelect.html");
		String path = file.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("cv")).sendKeys(path);

		Thread.sleep(3000);
		driver.quit();

	}

}
