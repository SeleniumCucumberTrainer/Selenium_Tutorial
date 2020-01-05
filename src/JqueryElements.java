import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryElements {

	public static void main(String[] args) {


		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		 	
		 	WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		 	
           Actions action = new Actions(driver);
		 	
		 	action.dragAndDropBy(slider, 200, 0).perform();
		 	
		 
		 	
		 	//span[contains(@class,'ui-slider-handle')]

	}

}
