package Qspiders;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Working_With_extentReports {

	public static void main(String[] args) throws InterruptedException, IOException {

		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/extent1.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(spark);
		ExtentTest test = reports.createTest("Demo");

		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO, "Browser Launched");
		driver.manage().window().maximize();
		test.log(Status.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com");
		test.log(Status.PASS, "Navigated To the webpage");

		String path = "./screenshot/extent1.png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileHandler.copy(temp, dest);

		test.addScreenCaptureFromPath("."+path);
		
		reports.flush();

		Thread.sleep(3000);
		driver.quit();

	}

}
