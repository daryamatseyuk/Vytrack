@vehicle_contracts
Feature: accessing vehicle contracts page
  User Story: As a user, I want to access to Vehicle contracts page

  Scenario Outline: store and sales managers access the vehicle contracts page
    Given user is on the login page
    When user logs in as a "<role>"
    And user selects "Vehicle Contracts" option in "Fleet" module
    Then user should see the "Vehicle Contract" page

    Examples:
      | role          |
      | sales manager |
      | store manager |


  Scenario: Drivers should NOT able to access the Vehicle contracts page
    Given User is logged in as "driver"
    When user clears the error message
    And user selects "Vehicle Contracts" option in "Fleet" module
    Then user should see "You do not have permission to perform this action." message