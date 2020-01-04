package SeleniumTwo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("http://www.hdfc.com");
		 	
		 	driver.findElement(By.linkText("Apply For Home Loan")).click();
		 	
		 	String parentWinId = driver.getWindowHandle();
		 	
		 	System.out.println(parentWinId);
		 	
		 	Set<String> allWwindowIds = driver.getWindowHandles();
		 	
		 	for( String wid_Id   : allWwindowIds  ){
		 		
		 		if(wid_Id!=parentWinId){
		 			driver.switchTo().window(wid_Id);
		 		}
		 	}
		 	
		 	
		 
		 
		 	driver.findElement(By.xpath("//button[@class='btn_common btn_white btn_big mr20 pointer']")).click();
		 	
		 	//driver.quit();
		 	
		 	
		 
		 	
		 	
		 	
		 	
		
		
		

	}

}
