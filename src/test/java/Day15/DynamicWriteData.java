package Day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicWriteData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"//testdata//dynamic.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("mydata");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many rows?");
		int rows = sc.nextInt();
		
		System.out.println("How many cells?");
		int cells = sc.nextInt();
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow createRow = sheet.createRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell createCell = createRow.createCell(c);
				createCell.setCellValue(sc.next());
			}
			
		}
		workbook.write(file);
		System.out.println("File created");
		workbook.close();
		file.close();
		
	}

}
