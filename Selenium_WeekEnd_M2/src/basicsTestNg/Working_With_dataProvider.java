package basicsTestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_dataProvider {

	@DataProvider(name = "testData")
	public Object[][] data() {
		Object data[][] = new Object[2][2];

		data[0][0] = "qspiders51@gmail.com";
		data[0][1] = "Qsp@1234";

		data[1][0] = "qspiders2596@gmail.com";
		data[1][1] = "Qsp@1234";

		return data;

	}

	@Test(dataProvider = "testData")
	public void dataProvider(String userName, String password) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
