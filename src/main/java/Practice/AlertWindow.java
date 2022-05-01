package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {
	
		public static void main(String[] args) throws Throwable {
			
			// small size = Alert window >> handle by Alert interface
			// medium or bigger size = Window alert >> Alert interface cannot handle 
			// handle by Robot class, AutoIT
			        
			
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/selenium/delete_customer.php");
			TimeUnit.SECONDS.sleep(3);
			
		    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("12345");
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
		    Thread.sleep(3000);
		    
		    Alert alert = driver.switchTo().alert(); // Alert is a interface 
		    Thread.sleep(3000);
		    
		    System.out.println(alert.getText());
		    
		    alert.accept();  // ok or accept button
		//  alert.dismiss();  // cancel  button
		    Thread.sleep(3000);
		    driver.quit();  
		
		}
	
}
