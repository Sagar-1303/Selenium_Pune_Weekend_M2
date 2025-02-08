package Qspiders;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_robot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);

//		Runtime.getRuntime().exec("notepad");
//		Thread.sleep(2000);
		Robot robot = new Robot();

		for (int i = 0; i < 25; i++) {
			Thread.sleep(100);
			robot.keyPress(KeyEvent.VK_TAB);
		}
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		Thread.sleep(3000);
		driver.quit();

	}

}
