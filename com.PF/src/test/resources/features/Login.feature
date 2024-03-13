Feature: Login functionality for Open-eCart
  I want to use this template for my feature file
	
	As a user of Open-eCart website
	I want to be able to login with my account
	So that I can access my account-related features

  Scenario: Successful login with valid credentials
    Given I have Landed on Login Page 
    When entered valid credentials
    And Clicked on Login button
    Then User should be logged in successfully