package seleniumexample1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Write_Data_into_Excel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow rows;
	XSSFCell cells;
	
	@Test
	public void writeIntoFile() {
		rows=sheet.createRow(0);
		cells=rows.createCell(0);
		cells.setCellValue(20);
	}
	@BeforeTest
	public void beforeTest() {
		file=new File("MyfirstsheetExcelFile.xlxs");
		try {
			fos=new FileOutputStream(file);
			wb=new XSSFWorkbook();
			sheet=wb.createSheet("Myfirstsheet");
			
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
			
		}
		
		
@AfterTest
   public void afterTest() {
	try {
	   wb.write(fos);
	   wb.close();
	   fos.close();
	}catch(IOException e){
		e.printStackTrace();
	}
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
