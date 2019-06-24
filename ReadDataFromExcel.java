/*package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.CellType;

public class ReadDataFromExcel {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\DataDrive.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		for(int i=0;i<physicalNumberOfRows;i++) {
			Row row=sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			System.out.println(physicalNumberOfCells);
			for (int j=0;j<physicalNumberOfCells;j++) {
	        Cell cell = row.getCell(j);
	        if(cell.getCellType().equals(CellType.STRING)) {
	        	String stringCellValue = cell.getStringCellValue();
	        	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
				driver=new ChromeDriver();
				driver.get("\\https:www.facebook.com");
				WebElement login = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			    login.sendKeys(stringCellValue);
			    //login.clear();
	        
	        	System.out.println(stringCellValue);
	        	}else {
	        		if(cell.getCellType().equals(CellType.NUMERIC)) {
	        			double numericCellValue = cell.getNumericCellValue();
	        			System.out.println(numericCellValue);
	        		}
	        	}
	        		
		
			
		}
			
		
		
	}
	

}}
*/