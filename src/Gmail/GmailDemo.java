package Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ExcelSheetDemo.Xls_Reader;

public class GmailDemo {
	
	
	@Test
	public void doLoginTest(){
		
		Xls_Reader excel = new Xls_Reader("C:\\Users\\akhilesg\\workspace\\SeleniumDemo\\Data\\testData.xlsx");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys(excel.getCellData("GmailLoginData", "UserName", 2));
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys(excel.getCellData("GmailLoginData", "Password", 2));
	}

}
