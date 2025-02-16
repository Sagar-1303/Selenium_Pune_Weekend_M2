package Qspiders;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Working_With_csvFile {

	public static void main(String[] args) throws InterruptedException, IOException, CsvException {

		FileReader file=new FileReader("./files/csvData.csv");
		CSVReader reader=new CSVReader(file);
		
		List<String[]> values = reader.readAll();
		for (String[] strings : values) {
			for (String strings2 : strings) {
				System.out.println(strings2);
			}
		}
		
		
//		String[] value = reader.readNext();
//		for (String string : value) {
//			System.out.println(string);
//		}
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("");
//
//		Thread.sleep(3000);
//		driver.quit();

	}

}
