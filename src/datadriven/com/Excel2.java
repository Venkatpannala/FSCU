package datadriven.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		//Locate the file
		FileInputStream fis = new FileInputStream("C:\\Users\\KITC20014\\Desktop\\Registration.xlsx");
		
		//Load the file
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		//Locate the sheet
		XSSFSheet sheet= workbook.getSheet("Reg");
		
		//find the number of rows
		int rowcount=sheet.getLastRowNum();
		
		// For loop for iterating the loops
		
		for(int row=1; row<=rowcount;row++){
			
			//Focus on current row
			XSSFRow currentrow= sheet.getRow(row);
			
		  String fname= currentrow.getCell(0).getStringCellValue();
		  
		  driver.findElement(By.xpath("//*[contains(@href,'REGISTER')]")).click();
		  driver.findElement(By.name("firstName")).sendKeys(fname);
		  
		  
		}
		
		
	}

	
}
