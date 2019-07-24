package datadriven.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("C:\\Users\\KITC20014\\Desktop\\TDECU-ProjectProperties2.xlsx");
        
        //Locate the file
        
        FileInputStream fis = new FileInputStream("C:\\Users\\KITC20014\\Desktop\\TDECU-ProjectProperties2.xlsx");
        
        //Load the file using workbook
        XSSFWorkbook workbook= new XSSFWorkbook(fis);
        //Load the sheet
        XSSFSheet sheet= workbook.getSheetAt(0);
        
        //Count total rows
        int rowcount=sheet.getLastRowNum();
        System.out.println(rowcount);
        int cellcount=sheet.getRow(0).getLastCellNum();
        
        System.out.println(cellcount);
         
        for (int i=0; i<rowcount; i++){
        	
        	 //Focus on current row
        	XSSFRow currentRow= sheet.getRow(i);
        	
        	 for(int j=0; j<cellcount; j++){
        		String value= currentRow.getCell(j).toString();//Read the value from a cell
        		
        		System.out.println(	"  "+value);
        	 }
        	 System.out.println();
        	
        }
	}

}
