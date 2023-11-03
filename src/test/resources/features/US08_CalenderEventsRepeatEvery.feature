@B30G20-183
Feature: As a user, I want to create a recurring(repetitive) calendar event.

	Background:
		Given User is logged in as "Driver"
		When User chooses Calendar Events option from "Activities" module
		And User clicks on Create Calendar Event button
		And User clicks on Repeat option

	@B30G20-181
	Scenario: US08 AC01 User should see the number “1” by default in the Repeat Every input.
		Then User should see "1" as default number
	
	@B30G20-182
	Scenario: US08 AC02 User should see an error message “This value should not be blank.” when the Calendar event repeat field is cleared(delete the number 1).
		And User delete "1" from Repeat Every input box
		Then User should see error message "This value should not be blank." message