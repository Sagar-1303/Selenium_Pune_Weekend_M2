package Qspiders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_POM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com");

		Books boo = new Books(driver);
		boo.getBooksLink().click();
		Select sel = new Select(boo.getSortByDD());
		List<WebElement> options = sel.getOptions();
		int size = options.size();

		for (int i = 0; i < size; i++) {
			sel.selectByIndex(i);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
