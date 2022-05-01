package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop { // selenium cannot handle
	                       // handle by Action class 
	
	public static void main(String[] args) throws Throwable {
		
	  WebDriverManager.chromedriver().setup();
	 
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	 	 
	  WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	  WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	  Thread.sleep(3000);
	  Actions action = new Actions(driver);
	  action.dragAndDrop(drag, drop).perform();
	  Thread.sleep(3000);
	  driver.quit();
	
	  
	}

}
