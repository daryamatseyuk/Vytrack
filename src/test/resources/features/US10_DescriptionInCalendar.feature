Feature: As a user, I want to write the “Description” when I create a calendar event.

  @US10
  Scenario: Users can write in the description box
    Given User is logged in as "Driver"
    When User chooses Calendar Events option from "Activities" module
    And User clicks on Create Calendar Event button
    And User writes "Description" in the description box
    Then User can see "Description" in the description box




