package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);

//		WebElement country = driver.findElement(By.xpath("//*[@select='country']"));
//		Select select = new Select(country);
//    	select.selectByIndex(10);
//		select.selectByVisibleText("BANGLADESH");
//      select.selectByValue("CHINA");		
		
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("BANGLADESH");
		Thread.sleep(2000);
		drpCountry.selectByVisibleText("CHINA");
		Thread.sleep(2000);
		driver.quit();


	}

}
