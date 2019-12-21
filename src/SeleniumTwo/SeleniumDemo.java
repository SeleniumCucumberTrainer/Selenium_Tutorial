package SeleniumTwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumDemo {
	
public static void main(String[] args) throws InterruptedException {
	
	
	

	 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
   
	 	WebDriver driver = new FirefoxDriver();
	 	
	 	driver.get("http://www.paypal.com");
	 	
	 	//WebElement firstElem = driver.findElement(By.tagName("a"));
	 	
	 	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	 	
	 	
	 	System.out.println("All Link on Page :"+ allLinks.size());
	 	
	 	for( WebElement x   :   allLinks){
	 		
	 		System.out.println(x.getText());
	 		
	 	}
	 	
       for( WebElement x   :   allLinks){
	 		
	 		System.out.println(x.getAttribute("href"));
	 		
	 	}
	 	
	 	String title = driver.getTitle();
	 	
	 	String currentUrl = driver.getCurrentUrl();
	 	
	 
	 	
	 	Thread.sleep(4000);
	 	
	 	
	 	driver.close();

}
}