package SeleniumTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.facebook.com");
		
		
		WebElement year_DropDown = driver.findElement(By.id("year"));
		
		Select select = new Select(year_DropDown);
		
		//select.selectByValue("5");
		
		select.selectByIndex(5);
		
		
		
		

	}

}
