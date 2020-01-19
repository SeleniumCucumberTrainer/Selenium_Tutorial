package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class PopUPMenuDemo {
	
	
	
    @Test(priority =2,invocationCount =1,dependsOnMethods="checkFileDescIsAvailable",groups="SmokeTest")
	public void checkRightClick(){
		
    	System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		WebElement image = driver.findElement(By.xpath("//p[contains(text(),'Click the image to show the menu')]/img"));
		Actions action = new Actions(driver);
		action.contextClick(image).perform();
		WebElement ProductInfo = driver.findElement(By.id("dm2m1i1tdT"));
	}
    
    @Test(priority =1,groups="SmokeTest",description="this TC is about")
	public void checkFileDescIsAvailable(){
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
	     
	     throw new SkipException("fdgd");
	}
    
    @Test(priority =3,groups="RegressionTest")
	public void checkAvailableOfAdditionalInfo(){
    	System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		boolean isEleFound = driver.findElement(By.xpath("//input[@value='Show Additional Info1']")).isDisplayed();
		
		if(isEleFound){
			System.out.println("Yes Show Additional Info text found");
		}
		else System.out.println("Show Additional Info text NOT found");
	}

}
