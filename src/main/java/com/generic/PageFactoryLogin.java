package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {
	
	PageFactoryLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@type='text']")
	private WebElement userName;
	
	@FindBy(xpath = "//*[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "(//*[@class='mouseOut'])[8]") // 1 of 1 grouping
	private WebElement signoff;
	
	@FindBy(xpath = "//*[@class='mouseOut']") // 1 of 11
	private List<WebElement> signoffList;  // findElements()
	
	@FindBy(xpath = "//*[text()='Login Successfully']")
	private WebElement loginStatusSuccessMsg;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSignoff() {
		return signoff;
	}

	public List<WebElement> getSignoffList() {
		return signoffList;
	}

	public WebElement getLoginStatusSuccessMsg() {
		return loginStatusSuccessMsg;
	}
	
	
	
	
	
	

}
