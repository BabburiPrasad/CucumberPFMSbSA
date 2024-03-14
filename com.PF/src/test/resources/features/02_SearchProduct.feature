Feature: Enter search input and search the product

@Regression
  Scenario: Enter search input and search the product
	  Given I clicked on Search field
    When I give search input
 	  And clicks on search button
    Then User should see the search results for the search input