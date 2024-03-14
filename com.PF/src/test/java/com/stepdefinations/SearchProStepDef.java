package com.stepdefinations;

import com.pompages.LoginPagePO;
import com.pompages.SearchProdPOM;
import com.utilities.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProStepDef extends BaseClass
{
	SearchProdPOM searchproduct = new SearchProdPOM();
	LoginPagePO lpp = new LoginPagePO(driver);
	

	@Given("I clicked on Search field")
	public void i_clicked_on_search_field() 
	{
		sleep(2000);
		visit(getData("url"));
		sleep(2000);
		sendKeys(lpp.enterUserName(), getData("username"));
		sleep(2000);
		sendKeys(lpp.enterPassword(), getData("password"));
		sleep(2000);
		click(lpp.cliconLoginbutton());
		sleep(2000);
		
		
	    click(searchproduct.getSearchinputfield());
	}
	@When("I give search input")
	public void i_give_search_input() 
	{
	    sendKeys(searchproduct.getSearchinputfield(), getData("searchinput"));
	}
	@And("clicks on search button")
	public void clicks_on_search_button() 
	{
	    click(searchproduct.getSearchbutton());
	}
	@Then("User should see the search results for the search input")
	public void user_should_see_the_search_results_for_the_search_input() 
	{
	    
	}
	
}
