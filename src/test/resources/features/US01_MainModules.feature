@B30G20-161
Feature: Main Modules
	User Story: As a user, I should be accessing all the main modules
	of the app.

	
	@B30G20-159
	Scenario Outline: US01AC01 Store and sales managers should view 8 module names.
		Given user is on the login page DM
		When user logs in as a "<role>"
		Then the user should see the following module names:
		      | Dashboards         |
		      | Fleet              |
		      | Customers          |
		      | Sales              |
		      | Activities         |
		      | Marketing          |
		      | Reports & Segments |
		      | System             |
		
		    Examples:
		      | role          |
		      | sales manager |
		      | store manager |	

	
	@B30G20-160
	Scenario Outline: US01AC02  Drivers should view 4 module names
		Given user is on the login page DM
		When user logs in as a "<role>"
		Then the user should see the following module names:
		      | Fleet      |
		      | Customers  |
		      | Activities |
		      | System     |
		
		    Examples:
		      | role   |
		      | driver |