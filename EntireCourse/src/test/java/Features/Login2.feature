Feature: Application_Login_2 
@Test	
Scenario: Validate Page load 
	Given User is on another login page 
		|http://www.youtube.com|
	Then Home page is ok