package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelSheetDemo.Xls_Reader;

public class DataProviderDemo {
	
	 Xls_Reader excel= new Xls_Reader("C:\\Users\\akhilesg\\workspace\\SeleniumDemo\\Data\\testData.xlsx");
	
	@Test(dataProvider="getData")
	public void doLogin(String UserId,String Passwrd){
		
		
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver();
		 
		    driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.get("http://www.gmail.com");
	        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(UserId);
	        driver.findElement(By.xpath("//*[@id='next']")).click();
	        driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(Passwrd);
	        driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
	}
	
	
	@DataProvider
	public Object [][] getData(){
	       
	     
	        int rowNum = excel.getRowCount("GmailLoginData");
	        int colCount = excel.getColumnCount("GmailLoginData");
	        
	        Object[][] data = new Object[rowNum][colCount];
	        System.out.println(rowNum +" -- " +colCount);
	 
	        for(int i =2;i<=rowNum;i++){
	            for(int j= 0; j<colCount;j++){
	                data[i-2][j]=excel.getCellData("GmailLoginData", j, i);
	                System.out.println(data[i-2][j]);
	            }
	        }
	       
	        return data;
	       
	       
	    }
	   

}
