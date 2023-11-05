@wip_ege
Feature: As a user, I should be able to select any vehicle from the Vehicle page

  Scenario Outline: Once the users launch on the Vehicle page, all the checkboxes should be unchecked.
    Given User is logged in as "<role>".
    When User chooses "Vehicles" option from "Fleet" Module
    Then User should see that all the checkboxes are unchecked

    Examples:
      | role          |
      | store manager |
      | sales manager |


  Scenario Outline: User checks the first checkbox to check all the cars
    Given User is logged in as "<role>".
    When User chooses "Vehicles" option from "Fleet" Module
    And User clicks on the first checkbox to check all the cars
    Then User should see that all checkboxes are selected

    Examples:
      | role          |
      | store manager |
      | sales manager |

  Scenario Outline: Users can select any car
    Given User is logged in as "<role>".
    When User chooses "Vehicles" option from "Fleet" Module
    And User clicks on any random checkbox to select a vehicle
    Then User should see that only that vehicle is selected

    Examples:
      | role          |
      | store manager |
      | sales manager |