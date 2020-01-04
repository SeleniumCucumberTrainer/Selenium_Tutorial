import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
	

		 	driver.get("file:///C:/Users/akhilesg/Desktop/AlertDemo.html");
		 	
		 	Thread.sleep(2000);
		 	
		 	driver.switchTo().alert().accept();
		


	}

}
