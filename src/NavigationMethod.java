import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationMethod {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("https://www.gmail.com");
		 	
		 	//driver.navigate().to("https://book.spicejet.com/Register.aspx");
		 	
		 	driver.findElement(By.id("identifierId")).sendKeys("seleniumbesttrainer@gmail.com");
		 	
		 	Actions action = new Actions(driver);
		 	
		 	action.sendKeys(Keys.ENTER).perform();
		 	
		 	//action.sendKeys(Keys.ENTER).perform();
		 	
		 	driver.findElement(By.xpath("//span[text()='Next']")).click();;
		 	
		 	//driver.navigate().back();
		 	
		 	Thread.sleep(3000);
		 	
			//driver.navigate().forward();
			
			driver.close();

	}

}
