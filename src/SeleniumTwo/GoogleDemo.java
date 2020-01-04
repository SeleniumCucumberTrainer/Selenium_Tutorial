package SeleniumTwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDemo {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("http://www.google.com");
		 	
		 	driver.findElement(By.name("q")).sendKeys("selenium");
		 	
		 	//Thread.sleep(10000);
		 	
		 	WebDriverWait wait = new WebDriverWait(driver,6);
		 	
		 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
		
		 	driver.findElement(By.name("btnK")).click();
		

	}

}
