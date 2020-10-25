@notRun
Feature: Login data creation
@Login
Scenario: offline website test
  Given Browser should be open 
  Then user enter url 
  Then logo should display
  
@LoginvalidTest
Scenario: valid username and password test
  Given user should be on login page
  When user enters username 
  And user enters password
  And user click on login button
  Then user should be on home page
  
	
	