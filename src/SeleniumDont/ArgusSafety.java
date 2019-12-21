package SeleniumDont;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ArgusSafety {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.ie.driver", "C:\\Users\\akhilesg\\Downloads\\IEDriverServer\\IEDriverServer.exe");
          //Initialize InternetExplorerDriver Instance.
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 caps.setCapability("ignoreZoomSetting", true);
		 //driver = new InternetExplorerDriver(caps);
          WebDriver driver = new InternetExplorerDriver(caps);
          driver.get("http://slc12qqv.us.oracle.com:8083/");
          
          
          Thread.sleep(3000);
          
          driver.switchTo().frame("fm_MainApp");
          
         
          
          driver.findElement(By.cssSelector("#loginId_id")).sendKeys("admin");
          
         
          
          driver.findElement(By.id("password_id")).sendKeys("manager");
          
   
          
          WebElement login= driver.findElement(By.cssSelector("#btn_login_id"));
          
          JavascriptExecutor js = (JavascriptExecutor)driver;
          
          js.executeScript("arguments[0].click()", login);
          
          
          
          driver.switchTo().defaultContent();
          
          Thread.sleep(4000);
          
         driver.switchTo().frame("fm_MainApp");
         Thread.sleep(2000);
          
         driver.switchTo().frame("fm_TopFrame");
         
         Thread.sleep(2000);
          
          WebElement caseActions = driver.findElement(By.xpath("//td[contains(text(),'Case Actions')]"));
          
          Actions mouse = new Actions(driver);
          
          mouse.moveToElement(caseActions).perform();
          
          
          mouse.sendKeys(Keys.chord(Keys.CONTROL,Keys.ALT,"N")).perform();;
          
          
         // driver.findElement(By.xpath("//*[contains(text(),'New')]")).click();;
          
          
          System.out.println("Checking");
         // driver.close();

	}

}
