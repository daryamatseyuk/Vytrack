@wipJamil
Feature:  As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

  Scenario Outline: users should see error messages for entering invalid integers.
  #If enters less than 1 —> user should see “The value have not to be less than 1.”
  #If enters more than 99 —> user should see “The value have not to be more than 99.”
  #[Note: no need to test valid number, data type, etc in this story.]
    Given User is logged in as "Driver"
    When User chooses Calendar Events option from "Activities" module
    And User clicks on Create Calendar Event button
    And User clicks on Repeat option
    And User enters "<Invalid Numbers>" in the Repeat Every input box
    Then User should see "<Error Message>" message


    Examples:
      | Invalid Numbers | Error Message                          |
      | -1              | The value have not to be less than 1.  |
      | 100             | The value have not to be more than 99. |