import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableDemo {
	
	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		 	
		 	WebElement resize = driver.findElement(By.xpath("//span[contains(@class,'ui-resizable-handle')]"));
		 	
        Actions action = new Actions(driver);
		 	
		 	action.dragAndDropBy(resize, 200, 200).perform();
		 	
		
		
		
		
	}

}
