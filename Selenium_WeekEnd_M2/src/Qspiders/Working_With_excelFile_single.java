package Qspiders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_With_excelFile_single {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./files/excelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(value);

	}

}
