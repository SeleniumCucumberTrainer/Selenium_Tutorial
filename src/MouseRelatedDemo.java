import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRelatedDemo {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("https://www.naukri.com");
		 	
		 	Actions action = new Actions(driver);
		 	
		 	action.moveToElement(driver.findElement(By.xpath("//div[text()='Jobs']"))).perform();
		 	
		 
		 	

	}

}
