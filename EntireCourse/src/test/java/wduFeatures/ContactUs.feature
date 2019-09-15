Feature: Contact Us of WebDriver University 

Scenario: Provide First name, last name, email address and Submit 
	Given User is on the Webdriver University Home page 
	And User click on Contact Us link 
	When User enters FirstName LastName Email and Comments 
	And User clicks on Submit button 
	Then Details should be successfully submitted 
	
Scenario: Provide FirstName, LastName, Email and Reset 
	Given User is on the Webdriver University Home page 
	And User click on Contact Us link 
	When User enters FirstName LastName Email and Comments 
	But User click on Reset Button 
	Then Details entered should be cleared
	
Scenario: Do not provide mandatory values and click on Submit
	Given User is on the Webdriver University Home page 
	And User click on Contact Us link
	When User clicks on Submit Button
	Then Error Message should be displayed
	

