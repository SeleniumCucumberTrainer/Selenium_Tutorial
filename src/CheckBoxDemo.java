import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {


		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	driver.get("https://book.spicejet.com/Register.aspx");
		 	
		 	WebElement checkBox = driver.findElement(By.id("chkSpiceClubTnC"));
		 	
		 	System.out.println(checkBox.isSelected());
		 	
		 	System.out.println(checkBox.isDisplayed());
		 	
		 	System.out.println(checkBox.isEnabled());
		 	
		 	checkBox.click();
		 	
		 	System.out.println(checkBox.isSelected());
		 	

	}

}
