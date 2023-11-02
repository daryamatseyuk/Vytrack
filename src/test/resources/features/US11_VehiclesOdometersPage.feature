@B30G20-177
Feature: As a user, I want to view car odometer info on the Vehicles Odometers page.

  Scenario Outline: Store and Sales managers should see an error message “You do not have permission to perform this action.”
  when they click the “Vehicle Odometer” module.

    Given User is logged in as "<role>"
    When User chooses "Vehicle Odometer" option from "Fleet" module
    Then user verifies "You do not have permission to perform this action."
    Examples:
      | role          |
      | sales manager |
      | store manager |

    Scenario: Drivers should see the default page as 1.
      Given User is logged in as "driver"
      When User chooses "Vehicle Odometer" option from "Fleet" module
      Then User should see default page as "1"

  Scenario: Divers should see the View Per Page is 25 by default.
    Given User is logged in as "driver"
    When User chooses "Vehicle Odometer" option from "Fleet" module
    Then User should see the view per page is "25" by default
