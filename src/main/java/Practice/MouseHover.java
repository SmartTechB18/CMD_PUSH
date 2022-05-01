package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	// selenium cannot
	// Action class yes
	// how = moveToWebElement();
	
	public static void main(String[] args) throws Throwable {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(); 
    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
    
    Thread.sleep(4000);
    WebElement hover = driver.findElement(By.xpath("//*[@id=\"sub-menu\"]"));
    Actions ac = new Actions(driver);
    ac.moveToElement(hover).perform();
    
    WebElement google = driver.findElement(By.xpath("(//*[@class='dropdown-content']/a)[2]"));
    google.click();
    

	}
}
