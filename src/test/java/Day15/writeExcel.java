package Day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writingExcel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("MyData");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Task number");
		row1.createCell(1).setCellValue("Task name");
		row1.createCell(2).setCellValue("Task type");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("211");
		row2.createCell(1).setCellValue("Incoming feeds problems");
		row2.createCell(2).setCellValue("Bugfix");
		
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("215");
		row3.createCell(1).setCellValue(" feeds problems");
		row3.createCell(2).setCellValue("Feature");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");
	}
	
}
