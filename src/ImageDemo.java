import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		WebElement image = driver.findElement(By.xpath("//p[contains(text(),'Click the image to show the menu')]/img"));
		
		Actions action = new Actions(driver);
		

		action.contextClick(image).perform();
		
		WebElement ProductInfo = driver.findElement(By.id("dm2m1i1tdT"));
		
		action.moveToElement(ProductInfo).perform();
		
        WebElement Installation = driver.findElement(By.id("dm2m2i1tdT"));
		
		action.moveToElement(Installation).perform();
		
	     //driver.findElement(By.id("dm2m3i0tdT")).click();
	     
	     action.click(driver.findElement(By.id("dm2m3i0tdT"))).perform();

	}

}
