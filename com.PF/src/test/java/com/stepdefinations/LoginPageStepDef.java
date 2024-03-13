package com.stepdefinations;

import com.pompages.LoginPagePO;
import com.utilities.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass
{
	public static LoginPagePO login = new LoginPagePO(driver);
	
	@Given("I have Landed on Login Page")
	public void i_am_on_the_open_cart_login_page() 
	{
		visit(getData("url"));
		sleep(2000);
	}

	@When("entered valid credentials")
	public void entered_valid_credentials() 
	{
		// Passing data directly from step definition file
		
//		login.enterUserName("e7w0fnwvv1@rentforsale7.com");
//		login.enterPassword("Test@123");
		
		// Fetching test data from property file
		sendKeys(login.enterUserName(), getData("username"));
		sleep(3000);
		sendKeys(login.enterPassword(), getData("password"));
		sleep(3000);
	}

	@And("Clicked on Login button")
	public void i_click_on_login_button() 
	{
		click(login.cliconLoginbutton());
	}
	
	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() 
	{
	    asserttext(login.getMyaccount().getText(), "My Account");
	    
	    System.out.println("Logged in Successfully");
	}
}
