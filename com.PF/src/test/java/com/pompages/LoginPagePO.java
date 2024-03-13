package com.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class LoginPagePO extends BaseClass
{
	
	public LoginPagePO(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	WebElement usernameinputfield;
	
	@FindBy(id="input-password")
	WebElement passwordtextfiled;
	
	@FindBy(xpath ="//input[@value='Login']")
	WebElement loginbutton;
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement myaccounttext;
		
	public WebElement enterUserName()
	{
		return usernameinputfield;
	}
	
	public WebElement enterPassword()
	{
		return passwordtextfiled;
	}
	
	public WebElement cliconLoginbutton()
	{
		return loginbutton;
	}
	
	public WebElement getMyaccount()
	{
		return myaccounttext;
	}
}
