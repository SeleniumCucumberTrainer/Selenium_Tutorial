package DatePicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo {

	public static void main(String[] args) {


		
		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
		 	String date ="11/12/2020";
		 	
		 	 String[] allDate =date.split("/");
		 	 
		 	 System.out.println(allDate[0]);
		 	System.out.println(allDate[1]);
		 	System.out.println(allDate[2]);
		 	
		 	
	

		 	driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&campaign=DF-Brand-EM&gclid=CjwKCAiAjMHwBRAVEiwAzdLWGGc-LiHVILn9PVYOwoX1bEfuke6O2loucefz0CVt-tBHIkxiMueGfRoC724QAvD_BwE");
		 	
            driver.findElement(By.id("departureCalendar")).click();
            
            while(true){
            
            try{
            
            driver.findElement(By.id("fare_"+allDate[2]+allDate[1]+allDate[0])).click();
        	break;
            
            }catch(Exception t){
            	driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();
            	
            }
            
            }
		 	
	}

}
