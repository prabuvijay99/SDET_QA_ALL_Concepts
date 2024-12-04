package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*	Excel file----->workbook----->sheets----->rows----->cells----->read/Write data
			XSSFWorkbook	XSSFSheet   XSSFRow   XSSFCell		FileInputStream
																FileOutputStream
*/
public class readExcel {

	public static void main(String[] args) throws IOException {
		
		//open excel file to read data
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testingdata.xlsx");
		//open the workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//select the sheet num
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//find the last number of row 
		int lastRowNum = sheet.getLastRowNum();
		// get the last cell number
		int lastCellNum = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows "+lastRowNum);
		System.out.println("Number of cells "+lastCellNum);
		
		for (int r=0;r<=lastRowNum;r++)
			{
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<lastCellNum;c++)
				{
					XSSFCell currentCell = currentRow.getCell(c);
					String data = currentCell.toString();
					System.out.print(data+"\t");
					
				}
				System.out.println();
			}
		workbook.close();
		file.close();
		
		
	}

}
