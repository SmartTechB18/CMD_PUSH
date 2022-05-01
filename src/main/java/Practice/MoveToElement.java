package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {  
//	How to move any element and click which not display/visible in my page?
//	Actions class >> moveToElements() >>>>>>best
//	Actions action = new Actions(driver);
//	Action.moveToElements(web element);
//    and >>>>	JavaScriptExecutor

	static void getMove() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
	
		Actions action = new Actions (driver);
		action.moveToElement((WebElement) By.xpath("//*[@alt='Ray-Ban Rb3647n Double Bridge Round Sunglasses']"));
	
	}
	
	public static void main(String[] args) {
		new MoveToElement().getMove();
	}

}
