import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HomePage {

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "https:/kwuat.fscu.com/apps/FSCU/";
		


	   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	     
/*	     ChromeOptions options= new ChromeOptions();
	     options.addArguments("test_typed");
	     options.addArguments("--start_maximized--");
	     options.addArguments("--enable -automation--");
	     options.addArguments("test_type=browser");
	     options.addArguments("disable-infobars");
	     */
	      WebDriver driver= new ChromeDriver();
	    
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(url);
		 //driver.manage().window().setSize(new Dimension(800, 600));
		 driver.manage().window().maximize();
		  //driver.quit();
		 
		  
	}

	
	
}
