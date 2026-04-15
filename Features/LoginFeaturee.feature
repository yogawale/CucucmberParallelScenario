Feature: Login

Scenario: Login with valid credentials with chrome
	Given User selects "firefox"
	When User opens URL "https://www.saucedemo.com/"
	And User enters "standard_user" and "secret_sauce"
	And User click on login button
	Then Page current url should be "https://www.saucedemo.com/inventory.html"
	When User click on log out link
	Then close browser

	Scenario: Login with valid credentials with chrome
	Given User selects "firefox"
	When User opens URL "https://www.saucedemo.com/"
	And User enters "standard_user" and "secret_sauce"
	And User click on login button
	Then Page current url should be "https://www.saucedemo.com/inventory.html"
	When User click on log out link
	Then close browser
	