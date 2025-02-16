package Qspiders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_With_excelFile_multiple {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./files/excelData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowNum = sheet.getPhysicalNumberOfRows();
		int cellNum = sheet.getRow(0).getPhysicalNumberOfCells();

		for (int i = 0; i < rowNum; i++) {

			for (int j = 0; j < cellNum; j++) {
				try {
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(value);
				} catch (NullPointerException e) {
					// TODO: handle exception
				}
			}
		}

	}

}
