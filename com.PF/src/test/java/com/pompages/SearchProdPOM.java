package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class SearchProdPOM extends BaseClass
{

	public SearchProdPOM()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='search']")
	public WebElement searchinputfield;
	
	@FindBy(xpath="//span[@class='input-group-btn']")
	public WebElement searchbutton;

	public WebElement getSearchinputfield() {
		return searchinputfield;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
}
