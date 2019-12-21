package SeleniumDont;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UsingJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.ie.driver", "C:\\Users\\akhilesg\\Downloads\\IEDriverServer\\IEDriverServer.exe");
		// Initialize InternetExplorerDriver Instance.
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		// driver = new InternetExplorerDriver(caps);
		
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://slc12qqv.us.oracle.com:8083/");

		

		Thread.sleep(3000);

		driver.switchTo().frame("fm_MainApp");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement user = driver.findElement(By.cssSelector("#loginId_id"));

		js.executeScript("arguments[0].value='admin';", user);

		WebElement pass = driver.findElement(By.id("password_id"));

		js.executeScript("arguments[0].value='manager';", pass);

		WebElement login = driver.findElement(By.cssSelector("#btn_login_id"));

		js.executeScript("arguments[0].click()", login);

		driver.switchTo().defaultContent();

		Thread.sleep(4000);

		Actions mouse = new Actions(driver);

		

		Thread.sleep(2000);

		driver.switchTo().frame("fm_MainApp");
		Thread.sleep(2000);

		driver.switchTo().frame("fm_TopFrame");

		Thread.sleep(4000);
		
		WebElement caseActions =
				driver.findElement(By.xpath("//td[contains(text(),'Case Actions')]"));

				

		        mouse.moveToElement(caseActions).perform();
		        
		        Robot rb = new Robot();
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_ALT);
				rb.keyPress(KeyEvent.VK_N);

				mouse.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys("n").keyUp(Keys.CONTROL).keyUp(Keys.ALT).build()
						.perform();
				
				driver.switchTo().defaultContent();
				
				Thread.sleep(2000);
				driver.switchTo().frame("fm_MainApp");
				Thread.sleep(2000);
				driver.switchTo().frame("fm_MainFrame");
				

		WebElement reportType = driver.findElement(By.id("TXT_search_report_type_id"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(By.id("TXT_search_report_type_id")));
		//fm_MainApp,fm_MainFrame
		// menu.click();
		Thread.sleep(2000);
		// menu.click();

		// mouse.doubleClick(reportType).perform();

		// WebElement dropdown = driver.findElement(By.id("SEL_TypeAheadDiv"));

		/*
		 * final By SCRIPT = By.tagName("script");
		 * 
		 * new WebDriverWait(driver,
		 * 5).until(ExpectedConditions.presenceOfAllElementsLocatedBy(SCRIPT));
		 * 
		 * System.out.println(driver.findElement(SCRIPT).getText());
		 */

		// Select select = new Select(dropdown);

		// select.selectByVisibleText("Spontaneous");

		js.executeScript("arguments[0].value='Spontaneous';", reportType);
		Thread.sleep(2000);

		// mouse.sendKeys(Keys.TAB).perform();

		WebElement search = driver.findElement(By.id("btn_Search_id"));

		js.executeScript("arguments[0].click()", search);

		System.out.println("Checking");
		// driver.close();
		Thread.sleep(4000);

		// driver.findElement(By.id("Header1_imbLogout")).click();

	}

}
