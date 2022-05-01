package com.generic;

import java.io.FileInputStream;
import java.sql.Driver;
import java.sql.DriverManager;

import javax.swing.text.Highlighter.Highlight;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Login {

	public void getLogin() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 		
		PageFactoryLogin pf = new PageFactoryLogin(driver);
		driver.get(BaseConfig.getconfig("URL"));
		Thread.sleep(4000);
         
		Highlighter.getColor(pf.getUserName(), driver);
		pf.getUserName().sendKeys(BaseConfig.getconfig("username"));
		Highlighter.getColor(pf.getPassword(), driver);
		pf.getPassword().sendKeys(BaseConfig.getconfig("password"));
		Highlighter.getColor(pf.getSubmit(), driver);
		pf.getSubmit().click();
		ScreenShot.getScreenShot(driver, "Login test status");
		System.out.println("Sign off is displayed or not = " + pf.getSignoff().isDisplayed());
//		System.out.println("Sign off is displayed or not = " + pf.getSignoffList().get(7).isDisplayed());// index number
        System.out.println("Sign off text = "+pf.getLoginStatusSuccessMsg().getText());
//		WebElement logSucces = driver.findElement(By.xpath("//*[text()='Login Successfully']"));
//		String text = logSucces.getText();  // get text from xpath
//		System.out.println(text);
//      hard Assert
//      Assert.assertEquals(pf.getLoginStatusSuccessMsg().getText(),"Login Successfully" );
        //OR
//		Assert.assertTrue(pf.getSignoff().isDisplayed());
		//OR
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(pf.getLoginStatusSuccessMsg().getText(), "Login Successfully");
		soft.assertTrue(pf.getSignoffList().get(7).isDisplayed());

	    driver.quit();
	    soft.assertAll();  // must need for softAssert

	}
       
}
