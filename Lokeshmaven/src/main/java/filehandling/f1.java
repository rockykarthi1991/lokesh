package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class f1 {
	
	@Test
	public void rw() throws IOException
	{
		
		//apache poi, poi ooxml, poi ooxml schema 
		
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		// number of columns : specific about the row index
		int c=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns "+ c);
		
		// rowindex, col index 
		XSSFCell data = sheet.getRow(6).getCell(2);
		System.out.println(data);
		
		sheet.getRow(5).createCell(5).setCellValue("Lokesh");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
	}

}
