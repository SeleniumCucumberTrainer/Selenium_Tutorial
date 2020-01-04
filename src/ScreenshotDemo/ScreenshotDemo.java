package ScreenshotDemo;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {

		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	try{

		 	driver.get("http://www.hdfc.com");
		 	
		 	driver.findElement(By.linkText("Loan Produ")).click();
		 	
		 	}catch(Exception t){
		 		
		 		Calendar cal = Calendar.getInstance();
		 		
		 		long timesInMili =cal.getTimeInMillis();
		 	

		  File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		  FileHandler.copy(screenshotFile, new File("C:\\Jar\\Screenshot\\firstScreenshot"+timesInMili+".png"));
		
		 	}
		 	
		 	
		
	}

}
