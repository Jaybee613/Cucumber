Feature: Application_Login 
@Test
Scenario Outline: Validate Successful Login 
	Given User is on Login page "<URL>" 
	When User enters username, password and Logs in 
	Then Home page is displayed 
	
	Examples: 
		|URL|
		|http://www.facebook.com|
		|http://www.gmail.com|

	
	
