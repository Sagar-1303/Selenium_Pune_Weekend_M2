package Qspiders;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select_multi {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/Nov/MultipleSelect.html");

		WebElement carsDD = driver.findElement(By.id("cars"));
		Select sel = new Select(carsDD);
		System.out.println(sel.isMultiple());
		sel.selectByIndex(2);
		sel.selectByVisibleText("Volvo");
		sel.selectByValue("audi");

		WebElement option = sel.getFirstSelectedOption();
		System.out.println(option.getText());
		System.out.println();

		List<WebElement> options = sel.getAllSelectedOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		System.out.println();

		List<WebElement> allOptions = sel.getOptions();
		for (WebElement webElement : allOptions) {
			System.out.println(webElement.getText());
		}

		sel.deselectByIndex(0);
		Thread.sleep(3000);
		driver.quit();

	}

}
