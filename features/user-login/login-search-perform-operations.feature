@formfill
Feature: Search page 
 As a user
 I should be able to perform following functions

@addsearchlink 
Scenario: User should successfully perform these operations
	Given I am logged in as user
	When I click on profile icon and profile link
	And I get the text from the email address
	And I validate wrong mobile number
	Then I correct mobile number
	And I fill the form and Capture the message
	And I go to my service page and get title of the page
	And I logout from the application
  