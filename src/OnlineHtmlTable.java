import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnlineHtmlTable {

	public static void main(String[] args) {


		 System.setProperty("webdriver.gecko.driver", "C:\\Jar\\driver\\geckodriver.exe");
		   
		 	WebDriver driver = new FirefoxDriver();
		 	
		 	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 	
	

		 	driver.get("https://www.cricbuzz.com/live-cricket-scores/22583/aus-vs-nz-3rd-test-new-zealand-tour-of-australia-2019-20");
		 	
		 	for(int i =1; i<=11;i++){
		 		
		 		for(int j=1;j<=6;j++){
		 		
		 			try{
		 		     String txtValue = driver.findElement(By.xpath("(//div[@class='cb-min-inf cb-col-100 ng-scope'])[1]/div["+i+"]/div["+j+"]")).getText();
		 		     System.out.print(txtValue+" ");
		 			}catch(Exception t){
		 				
		 			}
		 		
		 		}
		 		
		 		System.out.println();
		 		
		 	}
		 	

	}

}
