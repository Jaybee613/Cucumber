Feature: Application_Login 

Scenario Outline: Validate Successful Login 
	Given User is on Login page "<URL>" 
	When User enters username, password and Logs in 
	Then Home page is displayed 
	
	Examples: 
		|URL|
		|http://www.facebook.com|
		|http://www.gmail.com|
		
Scenario: Validate Page load 
	Given User is on another login page 
		|http://www.youtube.com|
	Then Home page is displayed 
	
	
