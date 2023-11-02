@B30G20-169
Feature: Accounts page customer filters
	User Story: As a user, I want to filter customers’ info on the
	Account page.


	@B30G20-168
	Scenario Outline: Verify users can filter customer's info on Accounts page
		Given user is on the homepage signed in as a "<role>"
		    When user clicks on "Accounts" option under "Customers" module
		    Then user is able to see below filters
		      | Account Name  |
		      | Contact Name  |
		      | Contact Email |
		      | Contact Phone |
		      | Owner         |
		      | Business Unit |
		      | Created At    |
		      | Updated At    |
		
		
		    Examples:
		      | role          |
		      | sales manager |
		      | store manager |
		      | driver        |