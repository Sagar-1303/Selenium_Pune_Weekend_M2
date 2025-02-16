package Qspiders;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Working_With_jsonFile {

	public static void main(String[] args) throws InterruptedException, IOException, ParseException {

		FileReader file = new FileReader("./files/jsonData.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(file);
		JSONObject map = (JSONObject) obj;
		Object value = map.get("EmpId");
		System.out.println(value);

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("");
//
//		Thread.sleep(3000);
//		driver.quit();

	}

}
